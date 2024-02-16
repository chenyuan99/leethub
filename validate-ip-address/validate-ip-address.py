class Solution:
    def validIPAddress(self, queryIP: str) -> str:
        if self.validIPv4(queryIP):
            return "IPv4"
        elif self.validIPv6(queryIP):
            return "IPv6"
        else:
            return "Neither"
    
    def validIPv4(self, ip):
        ip_split = ip.split('.')
        # check length
        if len(ip) < 7 or len(ip) > 15 or len(ip_split) != 4:
            return False
        # check octets value
        for s in ip_split:
            try:
                octet = int(s)
            except:
                return False
            if octet < 0 or octet > 255 or (octet < 10 and len(s) != 1) or \
               (10 <= octet < 100 and len(s) != 2) or (octet >= 100 and len(s) != 3):
                return False
        # check characters
        for c in ip:
            if not ('0' <= c <= '9' or c == '.'):
                return False  
        return True
            
    def validIPv6(self, ip):
        ip_split = ip.split(':')
        # check length
        if len(ip) < 15 or len(ip) > 39 or len(ip_split) != 8:
            return False
        # check hex
        for s in ip_split:
            if not (1 <= len(s) <= 4):
                return False
            for c in s:
                if not ('0' <= c <= '9' or 'A' <= c <= 'F' or 'a' <= c <= 'f'):
                    return False
        return True
class Solution:
    def divide(self, dividend: int, divisor: int) -> int:
        # result = dividend/divisor
        # if result < 0:
        #     return ceil(result)
        # else:
        #     return floor(result)
        quotient = 0
        if (dividend == -2147483648 and divisor == -1):
            return 2147483647
        if(dividend<0 and divisor<0):
            return (dividend//divisor)
        elif(dividend>0 and divisor>0):
            return math.floor(dividend/divisor)
        else:
            return math.ceil(dividend/divisor)
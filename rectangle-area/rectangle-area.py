class Solution:
    def computeArea(self, A: int, B: int, C: int, D: int, E: int, F: int, G: int, H: int) -> int:
        SA=abs((C-A)*(D-B))
        SB=abs((G-E)*(H-F))
        if E>=C or A>=G or B>=H or F>=D:
            return SA+SB
        else:
            x1=min(G,C)
            x2=max(A,E)
            y1=min(D,H)
            y2=max(B,F)
            return SA+SB-abs((x1-x2)*(y1-y2))
        
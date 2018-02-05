#!/bin/python3

import sys

def stringConstruction(s):
    # Complete this function
    a=[0]*26;
    for c in s:
        a[ord(c)-97]+=1
    count=0
    for i in range(26):
        if(a[i]!=0):
            count+=1
    return count

if __name__ == "__main__":
    q = int(input().strip())
    for a0 in range(q):
        s = input().strip()
        result = stringConstruction(s)
        print(result)


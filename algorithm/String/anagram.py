#!/bin/python3

import sys


def anagaram(s):
    l=len(s)
    if(l%2!=0):
        return -1
    sub1=s[:round(len(s)/2)]
    sub2=s[round(len(s)/2):]
    d={}
    for c in s:
        try:
            d[c]+=1
        except:
            d[c]=1
    totalDiff=0
    for k in d.keys():
        totalDiff+=abs(sub1.count(k)-sub2.count(k))
    return totalDiff/2


q = int(input().strip())
for a0 in range(q):
    s = input().strip()
    result = anagaram(s)
    print(int(result))


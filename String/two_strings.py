#!/bin/python3

import sys

def twoStrings(s1, s2):
    # Complete this function
    a=[0]*26
    b=[0]*26
    for c in s1:
        a[ord(c)-97]+=1
    for c in s2:
        b[ord(c)-97]+=1
    totalMatch=0
    for i in range(26):
        if(a[i]!=0 and b[i]!=0):
            totalMatch+=1
            break
    if(totalMatch==1):
         return "YES"
    else:
        return "NO"

q = int(input().strip())
for a0 in range(q):
    s1 = input().strip()
    s2 = input().strip()
    result = twoStrings(s1, s2)
    print(result)


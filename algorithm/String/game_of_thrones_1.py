#!/bin/python3

import sys
from collections import Counter
def gameOfThrones(s):
    # Complete this function
    counts=Counter(s)
    cnt=0
    for x in counts.values():
        if(x%2!=0):
            cnt+=1
    if(cnt>1):
        return  "NO"
    else:
        return "YES"

s = input().strip()
result = gameOfThrones(s)
print(result)


#!/bin/python3

import sys
from collections import Counter

def makingAnagrams(s1, s2):
    # Complete this function
    a=Counter(s1)
    a.subtract(s2)
    return sum(abs(x) for x in a.values())

s1 = input().strip()
s2 = input().strip()
result = makingAnagrams(s1, s2)
print(result)

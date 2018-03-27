#!/bin/python3

import sys
#make a single array and count by index from bigger array and subtract from index from small array
def missingNumbers(arr, brr):
    # Complete this function
    m=max(arr+brr)
    table=[0 for _ in range(m+1)]
    for b in brr:
        table[b]+=1
    for a in arr:
        table[a]-=1
    values=[y for y in range(len(table)) if table[y]!=0]
    return values;

if __name__ == "__main__":
    n = int(input().strip())
    arr = list(map(int, input().strip().split(' ')))
    m = int(input().strip())
    brr = list(map(int, input().strip().split(' ')))
    result = missingNumbers(arr, brr)
    print (" ".join(map(str, result)))



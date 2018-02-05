
if __name__ == '__main__':
    n = int(raw_input())
    arr = map(int, raw_input().split())
    maxL=max(arr)
    snd_max = [e for e in arr if e!=maxL]
    print (max(snd_max))


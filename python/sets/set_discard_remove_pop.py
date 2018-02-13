n=int(input().strip())
s=set(map(int,input().split()))
m=int(input().strip())
for i in range(m):
    a=str(input().strip())
    lis=a.split()
    if(a=='pop'):
        s.pop()
    elif(lis[0]=='remove'):
        s.remove(int(lis[1]))
    elif (lis[0] == 'discard'):
        s.discard(int(lis[1]))
total=0
for a in s:
    total+=a
print(total)



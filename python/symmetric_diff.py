m=int(input().strip())
data=input().strip()
n=int(input().strip())
data1=input().strip()
lis=data.split()
lis1=data1.split()
myset=set(lis)
myset1=set(lis1)
sym_dif=myset.difference(myset1)
sym_dif1=myset1.difference(myset)
total_diff=[]
#total_diff.append(sym_dif1)
#total_diff.append(sym_dif)
for a in sym_dif:
    total_diff.append(a)
for a in sym_dif1:
    total_diff.append(a)
total_diff=[int(a) for a in total_diff]
total_diff.sort()
for a in total_diff:
    print(a)


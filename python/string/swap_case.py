def swap_case(s):
    x=[]
    for i in s:
        if i.isupper():
             i=i.lower()
        else:
            i=i.upper()
        x.append(i)
    str1=''.join(x)
    str1.join(x)
    return str1

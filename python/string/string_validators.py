if __name__ == '__main__':
    s = input()
    s_len=len(s)
    fnd=0
    for c in s:
        if(c.isalnum()):
            fnd=1
            break
    if(fnd==1):
         print("True")
    else:
        print("False")
    fnd=0
    for c in s:
        if(c.isalpha()):
            fnd=1
            break
    if(fnd==1):
         print("True")
    else:
        print("False")
    fnd=0
    for c in s:
        if(c.isdigit()):
            fnd=1
            break
    if(fnd==1):
         print("True")
    else:
        print("False")
    fnd=0
    for c in s:
        if(c.islower()):
            fnd=1
            break
    if(fnd==1):
         print("True")
    else:
        print("False")
    fnd=0
    for c in s:
        if(c.isupper()):
            fnd=1
            break
    if(fnd==1):
         print("True")
    else:
        print("False")


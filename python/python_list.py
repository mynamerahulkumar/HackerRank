if __name__ == '__main__':
    N = int(input())
    l=[]
    for _ in range(N):
        s=input()
        s=s.split()
       # print(s)
        cmd=s[0]
        args=s[1:]
      #  print(cmd)
       # print(args)
        if(cmd!='print'):
            cmd+="("+",".join(args)+")"
            eval('l.'+cmd)
        else:
            print (l)
        


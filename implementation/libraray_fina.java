import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int d1,m1,y1,d2,m2,y2;
        d1=sc.nextInt();
        m1=sc.nextInt();
        y1=sc.nextInt();
        d2=sc.nextInt();
        m2=sc.nextInt();
        y2=sc.nextInt();
        int d=0,m=0,y=0;
        int cnt=0;
        if(y1>y2){
             cnt=10000;
        }
       else if(m1>m2&&y1>=y2){
          cnt=500*(m1-m2);
        }
        else if(d1>d2&&m1>=m2 &&y1>=y2){
            cnt=15*(d1-d2);
        }
        System.out.println(cnt);
        
    }
}

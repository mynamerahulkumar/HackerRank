import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0){
            int n=sc.nextInt();
            int cnt=0;
            int t1=n;
            while(t1>0){
                int r=t1%10;
                if(r!=0){
                    if(n%r==0){
                        cnt++;
                    }
                }
                t1=t1/10;
            }
            System.out.println(cnt);
        }
    }
}

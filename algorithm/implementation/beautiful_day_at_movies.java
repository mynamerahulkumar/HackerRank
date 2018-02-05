import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int i,j,k;
        i=sc.nextInt();
        j=sc.nextInt();
        k=sc.nextInt();
        int rev_x;
        int cnt=0,temp;
        for(int m=i;m<=j;m++){
            temp=m;
            rev_x=0;
            while(temp>0){
                rev_x=rev_x*10+temp%10;
                temp=temp/10;
            }
            int res=Math.abs(rev_x-m);
            if(res % k==0){
                cnt++;
            }
        }
        System.out.println(cnt);
        
    }
}

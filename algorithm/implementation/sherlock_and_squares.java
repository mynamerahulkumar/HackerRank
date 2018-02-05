import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        int a,b;
        while(t>0){
            a=sc.nextInt();
            b=sc.nextInt();
            int cnt=(int)(Math.floor(Math.sqrt(b))-Math.ceil(Math.sqrt(a))+1);
            System.out.println(cnt);
            t--;
        }
    }
}

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int k=5;
        int cnt=0;
        for(int i=0;i<n;i++){
            cnt+=Math.floor(k/2);
            k=(int)Math.floor(k/2)*3;
           // k=(Math.floor(k/2))*3;
        }
        System.out.println(cnt);
    }
}

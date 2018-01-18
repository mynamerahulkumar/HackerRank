import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String args[] ) throws Exception {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT */
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int index=0;
        for(int i=1;i<=n;i++){
            for(int j=0;j<n;j++){
                  if(i==arr[j]){
                      index=j+1;
                      break;
                  }
            }
            for(int j=0;j<n;j++){
                if(index==arr[j]){
                    System.out.println(j+1);
                    break;
                }
            }
        }
        
    }
}


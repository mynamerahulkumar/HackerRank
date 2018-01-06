import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int n;
        int k;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        k=sc.nextInt();
        int[]arr=new int[n];
        int res;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int b;
        b=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(i!=k){
                sum+=arr[i];
            }
        }
        sum=sum/2;
        if(sum<b){
            res=b-sum;
            System.out.println(res);
        }
        else{
            System.out.println("Bon Appetit");
        }
        
            
         
    }
}

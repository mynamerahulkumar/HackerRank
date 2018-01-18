import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int cost=100;
        int last=0;  
        for(int i=k;i<n;){
            if(c[i]==0){
                cost--;
            }
            else{
                cost=cost-1-2;
            }
            last=i;
            i+=k;
        }                    
             
           last=n-1-last;
           int r=k-last-1;
           while(r>=0&& r<n){
               if(r==0){
                   if(c[r]==0){
                        cost--;
                   }
                   else{
                     cost=cost-1-2;
                   }
                   break;
               }
               else{
                   if(c[r]==0){
                        cost--;
                   }
                   else{
                     cost=cost-1-2;
                   }
               }
               r+=k;
               if(r>=n){
                   r=n-1-r;
                  r=k-r-1;
               }
           }
       
        System.out.println(cost);
        
    }
}


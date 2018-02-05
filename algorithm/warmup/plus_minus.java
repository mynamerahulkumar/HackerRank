import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
           int pos=0,neg=0,zer=0;
        for(int i=0;i<n;i++){
            if(arr[i]>0){
                pos++;
            }
            else
                if(arr[i]<0){
                    neg++;
                }
            else {
                    zer++;
                }
        }
        double a,b,c;
        double p1,p2,p3,p4;
        p1=pos;
        p2=neg;
        p3=zer;
        p4=n;
       // System.out.println(p1+""+p2+""+p3+""+p4);
        a=(double)Math.round((p1/p4)*1000000)/1000000;
        b=(double)Math.round((p2/p4)*1000000)/1000000;
        c=(double)Math.round((p3/p4)*1000000)/1000000;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}


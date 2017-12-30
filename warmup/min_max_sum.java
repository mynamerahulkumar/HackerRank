import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long sum=0,min=999999999,max=0;
        if(min>a){
            min=a;
        }
        if(max<a){
            max=a;
        }
        sum+=a;
        if(min>b){
            min=b;
        }
        if(max<b){
            max=b;
        }
        sum+=b;
        if(min>c){
            min=c;
        }
        if(max<c){
            max=c;
        }
        sum+=c;
        if(min>d){
            min=d;
        }
        if(max<d){
            max=d;
        }
        sum+=d;
        if(min>e){
            min=e;
        }
        if(max<e){
            max=e;
        }
        sum+=e;
        System.out.println((sum-max)+" "+(sum-min));
    }
}


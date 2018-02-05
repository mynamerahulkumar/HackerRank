import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        long n = in.nextLong();
        char[] chrArray=new char[100000];
        chrArray=s.toCharArray();
        int cnt=0;
        int len=s.length();
        for(int i=0;i<len;i++){
            if(chrArray[i]=='a'){
                cnt++;
            }
        }
        long rep=n/len;
        long res=0;
        long cnt1=0;
        if(n % len ==0){
            res=(n/len)*cnt;
        }
        else{
            res=((n-1)/len)*cnt;
            cnt1=n%len;
            for(int i=0;i<cnt1;i++){
                if(chrArray[i]=='a'){
                    res++;
                }
            }
        }
        System.out.println(res);
        
    }
}


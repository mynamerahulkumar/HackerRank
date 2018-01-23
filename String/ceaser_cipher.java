import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n;
        String str;
        int k;
        n=sc.nextInt();
        str=sc.next();
        k=sc.nextInt();
        String str1="";
        char ch1=' ';
        int t1=0;
        for(char ch:str.toCharArray()){
            int temp=(int)ch;
            if(temp>=65 && temp<=90){
                temp=temp+k%26;
                if(temp>90){
                   t1=temp-90;
                   t1=t1+64;
                    temp=t1;
                }
                ch1=(char)temp;
                    str1+=ch1;
                
            }
           else if(temp>=97 && temp<=122){
               temp=temp+k%26;
                if(temp>122){
                   t1=temp-122;
                   t1=t1+96;
                    temp=t1;
                }
                ch1=(char)temp;
                    str1+=ch1;
               
            }
            else{
                str1+=ch;
            }
        }
        System.out.println(str1);
    }
}

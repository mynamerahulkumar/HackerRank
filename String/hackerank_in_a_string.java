import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        int q = sc.nextInt();
        String hack="hackerrank";
        char[] match=hack.toCharArray();
        for(int a0 = 0; a0 < q; a0++){
            String s = sc.next();
            // your code goes here
            char[]strc=s.toCharArray();
            int k=0,count=0;
            for(int i=0;i<strc.length;i++){
                if(strc[i]==match[k]){
                    count++;
                    k++;
                }
                if(count==10){
                    break;
                }
            }
            if(count==10){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }


        }
    }
}


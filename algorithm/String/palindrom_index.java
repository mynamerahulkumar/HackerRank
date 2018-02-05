mport java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int palindromeIndex(String s){
        // Complete this function
        StringBuilder sb=new StringBuilder(s);
        int len=s.length();
        int index=0;
        int fnd=0;
        int k=len-1;
        int index1=0;
        int len1=0;
        if(len%2==0){
            len1=len/2-1;
        }
        else{
            len1=len/2;
        }
        for(int i=0;i<len/2;i++){
            if(sb.charAt(i)!=sb.charAt(k)){
                fnd=1;
                index=k;
                index1=i;
                break;
            }
            else{
                k--;
            }
        }
        if(fnd ==1){
            sb.deleteCharAt(index);
            k=len-2;
            for(int i=0;i<len1;i++){
                if(sb.charAt(i)!=sb.charAt(k)){
                    fnd =2;
                    break;
                }
                else{
                    k--;
                }
            }
            if(fnd ==1){
                return index;
            }
            else{
                fnd =1;
                    StringBuilder sb1=new StringBuilder(s);
                    sb1.deleteCharAt(index1);
                    k=len-2;
                 for(int i=0;i<len1;i++){
                       if(sb1.charAt(i)!=sb1.charAt(k)){
                           fnd =2;
                             break;
                             }
                    else{
                        k--;
                    }
                 }
                 
                if(fnd ==1){
                    return index1;
                }
                else{
                    return -1;
                }
            }
        }
      return -1;  
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = palindromeIndex(s);
            System.out.println(result);
        }
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        int n = in.nextInt();
        int[]charCount=new int[27];
        for(char ch:s.toCharArray()){
            int temp=(int)(ch-'a');
            charCount[temp+1]++;
        }
        int[]countArray=new int[99999999];
        int k=0;
        for(int i=1;i<=26;i++){
            int temp=0;
            while(charCount[i]>0){
                temp+=i;
                countArray[k]+=temp;
                k++;
                charCount[i]--;
            }
        }
        for(int a0 = 0; a0 < n; a0++){
            int x = in.nextInt();
            int fnd=0;
            for(int i=0;i<k;i++){
                if(x==countArray[i]){
                    fnd=1;
                    break;
                }
            }
            if(fnd==1){
                System.out.println("Yes");
            }
            else{
                System.out.println("No");
            }
            // your code goes here
        }
    }
}


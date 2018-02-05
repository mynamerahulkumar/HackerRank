import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
       Scanner sc=new Scanner(System.in);
        String str;
        str=sc.nextLine();
        str=str.toLowerCase();
        int[]arr=new int[26];
        for(char ch:str.toCharArray()){
             int temp=(int)(ch-'a');
             if(temp<26 && temp>=0){
                 arr[temp]++;
             }
        }
        int fnd=0;
        for(int i=0;i<26;i++){
            if(arr[i]==0){
                fnd=1;
            }
        }
        if(fnd!=1){
            System.out.println("pangram");
        }
        else{
            System.out.println("not pangram");
        }
        
        
    }
}

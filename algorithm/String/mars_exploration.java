import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        char[] strArray=new char[101];
        strArray=S.toCharArray();
        int len_word=S.length()/3;
        int cnt=0;
        int[]arr=new int[3];
        arr[0]=Integer.valueOf('S');
        arr[1]=Integer.valueOf('O');
        arr[2]=Integer.valueOf('S');
        int k=0,temp;
        for(int i=0;i<len_word;i++){
            for(int j=0;j<3;j++){
                temp=Integer.valueOf(strArray[k]);
                if(temp!=arr[j]){
                    cnt++;
                }
                k++;
            }
        }
        System.out.println(cnt);
    }
}


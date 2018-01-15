import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 26;
        int h[] = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        char[]charArray =new char[100];
        charArray=word.toCharArray();
        int max=h[0],temp;
        for(int i=0;i<word.length();i++){
            temp=Integer.valueOf(charArray[i])-97;
            if(max<h[temp]){
                max=h[temp];
            }
        }
        System.out.println(max*word.length());

    }
}


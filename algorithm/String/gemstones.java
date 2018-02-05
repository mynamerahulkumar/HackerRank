import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int gemstones(String[] arr){
        // Complete this function
        int k=0;
        int[]alp=new int[26];
        for(int i=0;i<arr.length;i++){
            char[]chr=arr[i].toCharArray();
            k++;
            for(char ch:chr){
                if(alp[ch-97]==k-1)
                alp[ch-97]=k;
            }
        }
        int len=arr.length;
        int cnt=0;
        for(int i=0;i<26;i++){
            if(alp[i]==len){
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[] arr = new String[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.next();
        }
        int result = gemstones(arr);
        System.out.println(result);
    }
}


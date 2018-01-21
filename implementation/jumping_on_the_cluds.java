import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        int cnt=0;
        int i=0;
        for(i=0;i<n-2;i++){
            if(c[i+2]==0){
                cnt++;
                i++;
            }
            else{
                cnt++;
            }
        }
        if(i==n-2){
            cnt++;
        }
        System.out.println(cnt);
        
    }
}


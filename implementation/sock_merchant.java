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
        int[]socks=new int[101];
        int cnt=0;
        for(int i=0;i<n;i++){
            socks[c[i]]++;
        }
        for(int i=0;i<=100;i++){
            cnt+=socks[i]/2;
        }
        System.out.println(cnt);
    }
}


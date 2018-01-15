import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
        }
        // your code goes here
        int cnt=0,diff=0;
        for(int i=0;i<n;i++){
            if(height[i]>k){
                diff=height[i]-k;
                k=k+diff;
                cnt+=diff;
            }
        }
        System.out.println(cnt);
    }
}


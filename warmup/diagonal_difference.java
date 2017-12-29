import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[][] = new int[n][n];
        for(int a_i=0; a_i < n; a_i++){
            for(int a_j=0; a_j < n; a_j++){
                a[a_i][a_j] = in.nextInt();
            }
        }
        int d1=0,d2=0,i,j,k=0,p=n-1;
        for( i=0;i<n;i++){
           d1+=a[i][i];
            d2+=a[i][p];
            p--;
        }
        System.out.println(Math.abs(d1-d2));
    }
}


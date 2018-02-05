import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        int max1=a[0];
        int min2=101;
        int cnt=0;
        for(int i=0;i<n;i++){
            if(max1<a[i]){
                max1=a[i];
            }
        }
        for(int i=0;i<m;i++){
            if(min2>b[i]){
                min2=b[i];
            }
        }
        int fnd=0;
        if(max1<=min2){
            for(int i=max1;i<=min2;i++){
                for(int k=0;k<n;k++){
                    if(i%a[k]!=0){
                        fnd=1;
                        break;
                    }
                }
                if(fnd==0){
                    for(int k=0;k<m;k++){
                        if(b[k]%i!=0){
                            fnd=1;
                            break;
                        }
                    }
                }
                if(fnd==0){
                    cnt++;
                }
                fnd=0;
            }
            System.out.println(cnt);
        }
        else {
            System.out.println(cnt);
        }

        
    }
}


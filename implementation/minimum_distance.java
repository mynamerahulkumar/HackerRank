import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int index_min=999999;
        int index_diff=0;
        int fnd=0;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<n;j++){
                if(A[i]==A[j]){
                    fnd=1;
                  index_diff=j-i;
                    if(index_diff<index_min){
                        index_min=index_diff;
                    }
                }
            }
        }
        if(fnd==1){
        System.out.println(index_min);
        }
        else{
            System.out.println("-1");
        }
    }
}


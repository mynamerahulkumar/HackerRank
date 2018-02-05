import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n;
        n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int[] arrCnt=new int[101];
        for(int i=0;i<n;i++){
            arrCnt[arr[i]]++;
        }
        int max=0;
        for(int i=0;i<=100;i++){
            if(arrCnt[i]>max){
                max=arrCnt[i];
            }
        }
        System.out.println(n-max);
    }
}

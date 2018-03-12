import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] closestNumbers(int[] arr) {
        // Complete this function
        int len=arr.length;
        int[]resArr=new int[len*2];
        Arrays.sort(arr);
        int minD=arr[1]-arr[0];
        int k=0;
        for(int i=2;i<len;i++){
            int m=arr[i]-arr[i-1];
            if(m<minD){
                minD=m;
            }
        }
        for(int i=1;i<len;i++){
            int m=arr[i]-arr[i-1];
            if(m==minD){
               resArr[k++]=arr[i-1];
               resArr[k++]=arr[i];
            }
        }
        return resArr;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int[] result = closestNumbers(arr);
        for (int i = 0; i < result.length; i++) {
            if(result[i]!=0)
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}


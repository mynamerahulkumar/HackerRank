import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int runningTime(int[] arr) {
        // Complete this function
        int count=0;
        int n=arr.length;
        for(int i=1;i<n;i++){
            int key=arr[i];
            int j=i-1;
            /*
            Move take the key check to the left wheather it is greater than key
             Then move to the right
             then final place the key in sorted position w.r.t left
             */
            while(j>=0 && arr[j]>key){
                arr[j+1]=arr[j];
                 j--;
                count++;
            }
            arr[j+1]=key;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        int result = runningTime(arr);
        System.out.println(result);
        in.close();
    }
}


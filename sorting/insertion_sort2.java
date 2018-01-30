import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static void insertionSort2(int n, int[] arr) {
        // Complete this function
            for(int i=1;i<n;i++){
                int key=arr[i];
                int j=i-1;
                   /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
                while(j>=0 && arr[j]>key){
                    arr[j+1]=arr[j];
                    j--;
                }
                arr[j+1]=key;
                for(int k=0;k<n;k++){
                    System.out.print(arr[k]+" ");
                }
                System.out.println();
            }
     }
    

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int arr_i = 0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        insertionSort2(n, arr);
        in.close();
    }
}


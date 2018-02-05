import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int migratoryBirds(int n, int[] ar) {
        // Complete this function
        Arrays.sort(ar);
        int max=0;
        int cnt=0;
        int num=0;
        for(int i=0;i<n-1;i++){
            if(ar[i]==ar[i+1]){
                cnt++;
            }
            else{
                cnt=1;
            }
            if(cnt>max){
                max=cnt;
                num=ar[i];
            }
            if(max==cnt){
                if(ar[i]<num){
                    num=ar[i];
                }
            }
        }
        return num;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = migratoryBirds(n, ar);
        System.out.println(result);
    }
}


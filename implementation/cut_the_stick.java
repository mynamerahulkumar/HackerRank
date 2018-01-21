import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[]arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int cnt=0;
        int min=1001;
        int fnd=0;
        while(fnd==0){
            int fnd1=0;
            cnt=0;
            min=1001;
            for(int i=0;i<n;i++){
                if(min>=arr[i]&&arr[i]>0){
                    min=arr[i];
                }
            }
            for(int i=0;i<n;i++){
                if(arr[i]>0){
                    arr[i]=arr[i]-min;
                    fnd1=1;
                    cnt++;
                }
            }            
            if(fnd1==1 ){
                     System.out.println(cnt);
            }
            if(fnd1==0 ||cnt==1){
                fnd=1;
                break;
            }
        }
    }
}

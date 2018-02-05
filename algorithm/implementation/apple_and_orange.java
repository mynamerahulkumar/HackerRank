import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        int cnt=0,cnt2=0,dis=0;
        for(int i=0;i<m;i++){
            dis=apple[i]+a;
            if(dis>=s && dis<=t){
                cnt++;
            }
        }
        for(int i=0;i<n;i++){
            dis=orange[i]+b;
            if(dis>=s && dis<=t){
                cnt2++;
            }
        }
        System.out.println(cnt);
        System.out.println(cnt2);
        
    }
}

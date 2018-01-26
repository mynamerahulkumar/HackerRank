import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int minSteps(int n, String B){
        // Complete this function
        int cnt=0;
        char[]chr=B.toCharArray();
        for(int i=0;i<n;i++){
            int fnd=0;
            if(chr[i]=='0'){
                fnd++;
                i++;
                if(i<n &&chr[i]=='1'){
                    i++;
                    fnd++;
                    if(i<n && chr[i]=='0'){
                       // i++;
                        fnd++;
                    }
                    else{
                        i--;
                    }
                }
                else{
                    i--;
                }
            }
            if(fnd ==3){
                cnt++;
            }
        }
        return cnt;
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String B = in.next();
        int result = minSteps(n, B);
        System.out.println(result);
    }
}


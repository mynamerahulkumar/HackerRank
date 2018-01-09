import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int n, int p){
        // Complete this function
        int s=p/2;
        int e;
        if(n%2==0){
            e=(n-p+1)/2;
        }
        else{
            e=(n-p)/2;
        }
        if(s>e){
            return e;
        }
        else{
            return s;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int result = solve(n, p);
        System.out.println(result);
    }
}


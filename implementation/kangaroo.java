import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();
        int fnd=0;
        if((x1>x2) && (v2>v1)){
            if(v2!=v1 &&((x2-x1)%(v2-v1)==0)){
            System.out.println("YES");
                fnd=1;
        }
            
        }
         if((x2>x1) &&(v1>v2)){
            if(v2!=v1 &&((x2-x1)%(v2-v1)==0)){
            System.out.println("YES");
                fnd=1;
        }
           
        }
         if((x1==x2) &&(v1==v2)){
            System.out.println("YES");
            fnd=1;
        }
        if(fnd==0){
            System.out.println("NO");
        }
    }
}


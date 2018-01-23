    import java.io.*;
    import java.util.*;
    import java.text.*;
    import java.math.*;
    import java.util.regex.*;

    public class Solution {

        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String s = in.next();
            char strArr[]=new char[100001];
            strArr=s.toCharArray();
            int cnt=0,temp;
           for(int i=1;i<s.length();i++){
               temp=Integer.valueOf(strArr[i]);
               if(temp>=65 && temp<=90){
                   cnt++;
                }
            }
        System.out.println(cnt+1);
        }
    }


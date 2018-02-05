
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String timeConversion(String s) {
         String[] arr=s.split(":");
        int fnd =0;
        if(arr[2].contains("AM")){
            String last=arr[2].replaceAll("AM","");
            if(arr[0].matches("12") && arr[1].matches("00") && last.matches("00")){
                s="00:00:00";
            }
           else if(arr[0].matches("12")) {
                s="00:"+arr[1]+":"+last;
            }
            else {
                s=arr[0]+":"+arr[1]+":"+last;
            }
        }
        else{
            String last=arr[2].replaceAll("PM","");
            if(arr[0].matches("00") &&arr[1].matches("00") && last.matches("00")){
                s="12:00:00";
            }
            else{
               
                 int a=Integer.valueOf(arr[0]);
                if(a!=12)
                {
                    a=a+12;
                }
                 s=a+":"+arr[1]+":"+last;
            }
        }
        return s;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
    }
}

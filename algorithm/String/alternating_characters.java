import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int alternatingCharacters(String s){
        // Complete this function
        int cnt=0;
        char[]chr=s.toCharArray();
        int len=s.length();
        for(int i=0;i<len-1;i++){
              while(chr[i]==chr[i+1]){
                  cnt++;
                  i++;
                  if(i==len-1){
                      break;
                  }
              }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int result = alternatingCharacters(s);
            System.out.println(result);
        }
    }
}


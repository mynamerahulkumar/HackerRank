import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
                int t;
                Scanner sc= new Scanner(System.in);
                t=sc.nextInt();
                int temp=0,fnd=0, j,len;
                while (t>0){
                    String str=sc.next();
                    char[]strToChar=str.toCharArray();
                    fnd=1;
                    j=str.length()-1;
                    temp=0;
                    len=str.length();
                    for(int i=0;i<len/2;i++){
                        if(!(Math.abs(strToChar[i]-strToChar[i+1])==Math.abs(strToChar[j]-strToChar[j-1]))){
                            fnd=0;
                            break;
                        }
                        j--;
                    }
                    if(fnd==1){
                        System.out.println("Funny");
                    }
                    else {
                        System.out.println("Not Funny");
                    }
                }
    }
}

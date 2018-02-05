import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            int fnd=0;
            int t1=Math.abs(x-z);
            int t2=Math.abs(y-z);
            if(t1<t2){
                System.out.println("Cat A");
            }
            else if(t1>t2){
                System.out.println("Cat B");
            }
            else{
                System.out.println("Mouse C");
            }
        }
    }
}


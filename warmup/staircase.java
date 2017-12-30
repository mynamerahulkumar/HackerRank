import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         int n;
        Scanner sc= new Scanner(System.in);
        n=sc.nextInt();
        int j=0;
        for(int i=n-1;i>=0;i--){
            for( j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=j;k<n;k++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}

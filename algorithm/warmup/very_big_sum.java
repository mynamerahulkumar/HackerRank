import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;
public class Solution {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        BigInteger[] inp_array=new BigInteger[n];
        int i;
        for(i=0;i<n;i++)
        {
            inp_array[i]= in.nextBigInteger();
        }
        BigInteger res=BigInteger.valueOf(0);
        for(i=0;i<n;i++)
        {
            res=res.add(inp_array[i]);
        }
        System.out.println(res);
    }
}


import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
/*
1.find min in all 3 stacks
2.compare min with sum of all stack .
3.sum > min subtract .
4.subtract untill all are equal or all array is non empty.
5.if all are equal print and break
6.else print 0*/
public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int n3 = in.nextInt();
        int h1[] = new int[n1];
        int sum1=0;
        int sum2=0;
        int sum3=0;
        int min=0;
        int fnd=0;
        for(int h1_i=0; h1_i < n1; h1_i++){
            h1[h1_i] = in.nextInt();
            sum1+=h1[h1_i];
        }
        int h2[] = new int[n2];
        for(int h2_i=0; h2_i < n2; h2_i++){
            h2[h2_i] = in.nextInt();
            sum2+=h2[h2_i];
        }
        int h3[] = new int[n3];
        for(int h3_i=0; h3_i < n3; h3_i++){
            h3[h3_i] = in.nextInt();
            sum3+=h3[h3_i];
        }
       // n1--;
       // n2--;
       // n3--;
        int i=0,j=0,k=0;
        if(n1==0 || n2==0 ||n3==0){
            System.out.print(n1);
        }
        else
        while(fnd==0 && i<n1 && j<n2 && k<n3){
                min=Solution.findMin(sum1,sum2,sum3);
            //System.out.print(min);
            //break;
             //  System.out.print(min);
                if(sum1>min){
                    sum1=sum1-h1[i];
                    i++;
                }
               if(sum2>min){
                   sum2=sum2-h2[j];
                   j++;
               }
               if(sum3>min){
                   sum3=sum3-h3[k];
                   k++;
               }
            if(sum1==sum2){
                if(sum1==sum3){
                System.out.println(sum1);
                fnd=1;
                break;
                }
            }
            
        }
        if(fnd==0){
            System.out.print("0");
        }
    }
    static int  findMin(int x,int y,int z){
        if(x>y){
            x=y;
        }
        if(x>z){
            return z;
        }
        else{
            return x;
        }
    }
    
}


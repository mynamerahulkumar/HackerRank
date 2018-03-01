import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc=new Scanner(System.in);
        int q;
        q=sc.nextInt();
        Stack<Integer>s1=new Stack<>();
        Stack<Integer>s2=new Stack<>();
        int type=0,x=0,top;
        while(q>0){
            type=sc.nextInt();
            if(type==1){
                x=sc.nextInt();
                /*if(!s2.isEmpty()){
                    while(!s2.isEmpty()){
                        top=s2.pop();
                        s1.push(top);
                    }
                } */
               // System.out.print(x+" ");
                s1.push(x);
            }
           else if(type==2){
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        top=s1.pop();
                        s2.push(top);
                    }
                
                if(!s2.isEmpty()){
                    s2.pop();
                }
                }
               else{
                                       s2.pop();

               }
            }
          else  if(type==3){
                if(s2.isEmpty()){
                    while(!s1.isEmpty()){
                        
                        top=s1.pop();
                        s2.push(top);
                                           // System.out.println(top+"--");

                    }
                                        System.out.println(s2.peek());

                }
                else{
                    System.out.println(s2.peek());
                }
            }
            q--;
        }
    }
}

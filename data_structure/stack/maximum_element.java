import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
class StackNode{
    int val;
    int curMax;
    StackNode(int val,int curMax){
        this.val=val;
        this.curMax=curMax;
    }
}
public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
         Scanner sc=new Scanner(System.in);
        int N;
        N=sc.nextInt();
        Stack<StackNode>stack=new Stack<>();
        sc.nextLine();
        int max=Integer.MIN_VALUE;
        for(int i=0;i<N;i++){
            int  choice=sc.nextInt();
            if(choice==1){
                int val=sc.nextInt();
                max=Math.max(val,max);
                stack.push(new StackNode(val,max));
            }
            if(choice==2){
                if(!stack.empty())
                stack.pop();
                if(stack.isEmpty()){
                    max=Integer.MIN_VALUE;
                }
                else{
                    max=stack.peek().curMax;
                }
            }
            else if(choice==3){
                if(!stack.isEmpty()){
                    System.out.println(stack.peek().curMax);
                }
            }
        }
    }
}

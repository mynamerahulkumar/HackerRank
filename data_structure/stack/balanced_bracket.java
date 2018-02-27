import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static String isBalanced(String s) {
        // Complete this function
        Stack<Character>stack=new Stack<>();
        char[]chr=s.toCharArray();
        int fnd=0;
        
        
        for(char ch:chr){
                                              // System.out.print(ch+"--");
      
            if(ch==')'){
                if(!stack.isEmpty()){
                                      //  System.out.print(ch+">");

                   char ch1=stack.pop();
                                     //System.out.print(ch+">");

                    if(ch1!='('){
                        fnd=1;
                        break;
                    }
                }
                else{
                    fnd=1;
                    break;
                }
            }
          else  if(ch==']'){
                                 // System.out.print(ch+">");

                if(!stack.isEmpty()){
                  char  ch1=stack.pop();
                    if(ch1!='['){
                        fnd=1;
                        break;
                    }
                }
                else{
                    fnd=1;
                    break;
                }
            }
           else if(ch=='}'){
                                  // System.out.print(ch+">");

                if(!stack.isEmpty()){
                   char ch1=stack.pop();
                    if(ch1!='{'){
                        fnd=1;
                        break;
                    }
                }
                else{
                    fnd=1;
                    break;
                }
            }
            else{
                stack.push(ch);
              //  System.out.print(ch);
            }
            
        }
        if(fnd==1 ||!stack.isEmpty()){
            return "NO";
        }
        else{
            return "YES";
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            String s = in.next();
            String result = isBalanced(s);
            System.out.println(result);
        }
        in.close();
    }
}


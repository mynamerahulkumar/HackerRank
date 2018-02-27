/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
    int data;
    Node left;
    Node right;
     }
*/
//http://www.geeksforgeeks.org/a-program-to-check-if-a-binary-tree-is-bst-or-not/
       boolean checkUtilBst(Node node,int min,int max){
               if(node==null){
                   return true;
               }
            if(node.data<min || node.data >max){//it first goest to left child end since it is minimum return //checkUtilBst(node.left,min,node.data-1)node.data-1 ,should <max
                return false;
            }
           return (checkUtilBst(node.left,min,node.data-1) && checkUtilBst(node.right,node.data+1,max));
       }
    boolean checkBST(Node root) {
                 return checkUtilBst(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }


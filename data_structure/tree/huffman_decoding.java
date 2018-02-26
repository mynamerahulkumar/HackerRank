/*  
   class Node
      public  int frequency; // the frequency of this tree
       public  char data;
       public  Node left, right;
    
*/ 

void decode(String S ,Node root)
    {
         char[]chr=S.toCharArray();
         Node rt=root;
         for(char ch:chr){
             if(ch=='1'){
                 if(rt.right!=null){
                     rt=rt.right;
                 }
                  if(rt.right==null && rt.left==null){
                     System.out.print(rt.data);
                     rt=root;
                 }
             }
             else {
                 if(rt.left!=null){
                     rt=rt.left;
                 }
                  if(rt.left==null && rt.right==null){
                     System.out.print(rt.data);
                     rt=root;
                 }
             }
         }
    }


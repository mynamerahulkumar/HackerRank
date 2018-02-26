 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node Insert(Node root,int value) {
            Node t=root;
            Node n=root;
    Node newNode=new Node();
      newNode.left=null;
      newNode.right=null;
      newNode.data=value;
    if(root==null){
        root=newNode;
        return root;
    }
            while(t!=null){
                n=t;
                if(value>t.data){
                    t=t.right;
                }
                else{
                    t=t.left;
                }
            }
          if(value>n.data){
              n.right=newNode;
          }
         else{
             n.left=newNode;
         }
       return root;
    }




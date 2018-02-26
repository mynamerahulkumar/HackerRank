

 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

static Node lca(Node root,int v1,int v2)
    {
            Node node=root;
             int temp=v1;
                if(v1>v2){
                    v1=v2;
                    v2=temp;
                }
            while(node!=null){
                if(node.data>=v1 && node.data<=v2){
                    break;
                }
                else if(node.data>v2){
                    node=node.left;
                }
                else {
                    node=node.left;
                }
            }
     return node;
       
    }






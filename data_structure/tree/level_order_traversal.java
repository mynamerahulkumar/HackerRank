   /* 
    
    class Node 
       int data;
       Node left;
       Node right;
   */
   void levelOrder(Node root) {
      /*
      https://www.java2blog.com/binary-tree-level-order-traversal-in/
      */
      Queue<Node> q=new LinkedList();
       q.add(root);
       while(!q.isEmpty()){
           Node node=q.poll();
           System.out.print(node.data+" ");
           if(node.left!=null){
               q.add(node.left);
           }
           if(node.right!=null){
               q.add(node.right);
           }
       }
    }


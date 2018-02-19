/*
  Merge two linked lists 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node mergeLists(Node nodeA, Node nodeB) {
     // This is a "method-only" submission. 
     // You only need to complete this method 
      Node newNode=new Node();
        newNode.next=null;
        newNode.data=0;
        Node newHead=newNode;
        while (nodeA!=null || nodeB !=null){
            if(nodeA!=null && nodeB!=null){
                if(nodeA.data <nodeB.data){
                    newHead.next=nodeA;
                    nodeA=nodeA.next;
                }
                else {
                    newHead.next=nodeB;
                    nodeB=nodeB.next;
                }
                newHead=newHead.next;
            }
            else  if(nodeA==null) {
                newHead.next = nodeB;
                break;
            }
            else if (nodeB ==null) {
                newHead.next=nodeA;
                break;
            }
        }
        return newNode.next;

}


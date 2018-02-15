/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    Node newNode=new Node();
    newNode.next=null;
    newNode.data=data;
    Node h1=new Node();
    h1=head;
     if(head ==null)  {          
         // head=new Node(data);
          head=newNode;
          return h1;
      }
     
    while(head.next!=null){
        head=head.next;
    }
    head.next=newNode;
    return h1;
  
}


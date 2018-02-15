/*
  Insert Node at the beginning of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
// This is a "method-only" submission. 
// You only need to complete this method. 

Node Insert(Node head,int x) {
     Node t1=new Node();
        t1.data=x;
        if(head==null){
            head=t1;
        }
        else{
            t1.next=head;
            head=t1;
        }
        return head;
    
}


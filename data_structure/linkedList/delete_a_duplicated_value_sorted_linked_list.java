/*
Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/

Node RemoveDuplicates(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
   
     //take pointer 1 for iteration and 2 for checking duplicate
    Node t=head;
    Node t1=head;
    while(t!=null){
        t1=t;
        while(t.next!=null){
            if(t.data!=t.next.data){
                break;
            }
            else{
                t=t.next;               
            }
        }
        t1.next=t.next;
        if(t!=null){
            t=t.next;
        }
    }
    return head;

}


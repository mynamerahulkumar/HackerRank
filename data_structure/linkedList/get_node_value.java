/*
  Get Nth element from the end in a linked list of integers
  Number of elements in the list will always be greater than N.
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    
int GetNode(Node head,int n) {
     // This is a "method-only" submission. 
     // You only need to complete this method. 
      //  Node t=head;
        int cnt=0;
        Node t=head;
      while(head.next!=null){
          head=head.next;
          if(cnt<n){
              cnt++;
          }
          else{
              t=t.next;
          }
      }
    return t.data;


}


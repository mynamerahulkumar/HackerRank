/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

boolean hasCycle(Node head) {
   /* slow pointer fast pointer concept */
    Node slow=head;
    Node fast=head;
     while(slow!=null && fast!=null && fast.next!=null){
         slow=slow.next;
         fast=fast.next.next;
         
          if(fast!=null){
              if(fast==slow){
                  return true;
              }
          }
     }
    return false;
}


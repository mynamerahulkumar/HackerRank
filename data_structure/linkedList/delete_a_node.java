/*
  Delete Node at a given position in a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 

Node Delete(Node head, int position) {
   
  // Complete this method
      Node t=new Node();
    Node t1=new Node();
    Node startHead=head;
    t1=head;
    t.data=data;
 
        if(position==0){
            if(head==null){
                
            }
            else if(position==0){
                head=head.next;
            }
            return head;
        }
        else{
            int cnt=0;
            while(cnt<position-1 && head.next!=null){
                cnt++;
                head=head.next;
            }
            
          if(head.next==null){
              //return;
          }
            head.next=head.next.next;
            
        }
        return startHead;

}



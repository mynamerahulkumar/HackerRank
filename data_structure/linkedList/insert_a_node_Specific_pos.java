/*
  Insert Node at a given position in a linked list 
  head can be NULL 
  First element in the linked list is at position 0
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
    

Node InsertNth(Node head, int data, int position) {
   // This is a "method-only" submission. 
    // You only need to complete this method. 
     Node t=new Node();
    Node t1=new Node();
    Node startHead=head;
    t1=head;
    t.data=data;
 
        if(position==0){
            if(head==null){
                head=t;
                t.next=null;
            }
            else{
                t.next=head;
                head=t;
            }
            return t;
        }
        else{
            int cnt=0;
            while(cnt<position-1 && head.next!=null){
                cnt++;
                head=head.next;
            }
           t1=head.next;
            head.next=t;
            t.next=t1;
            
        }
        return startHead;
}


/*
  Find merge point of two linked lists
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    
    /* Find the length of two linked list and traverst it if(l1>l2) l1-ll2 in  first linked list
    .Then travese together and same node is mergin point.
    */
    Node t1=headA;
    Node t2=headB;
    int len1=0,len2=0;
    while(t1!=null){
        len1++;
        t1=t1.next;
    }
    while(t2!=null){
        len2++;
        t2=t2.next;
    }
    Node headL,headS;
    if(len1>=len2){
        headL=headA;
        headS=headB;
    }
    else{
        headL=headB;
        headS=headA;
    }
    int diff=Math.abs(len1-len2);
    while(diff>0 &&headL!=null){
        headL=headL.next;
        diff--;
    }
    while(headL!=null && headS!=null){
        if(headL==headS){
         return headL.data;
        }
        headL=headL.next;
        headS=headS.next;
    }
    
    return 0;

}


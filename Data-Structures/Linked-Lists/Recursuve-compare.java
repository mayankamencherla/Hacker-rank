/*
  Compare two linked lists A and B
  Return 1 if they are identical and 0 if they are not. 
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int CompareLists(Node headA, Node headB) {
    // This is a "method-only" submission. 
    // You only need to complete this method 
    
    int retval = 1;
    
    if(headA == null && headB == null) return 1;
    
    else if(headA == null || headB == null) return 0;
    
    else if(headA.data == headB.data) {
        retval = CompareLists(headA.next,headB.next);
        //return ;
    }
    
    else retval =0;
    
    return retval;
  
}

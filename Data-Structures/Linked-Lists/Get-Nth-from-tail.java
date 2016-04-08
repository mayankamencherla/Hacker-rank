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
    
    // My algorithm is to have 2 pointers to the head, advance one pointer by n, and then each by 1 step every turn
    // when the fast pointer reaches the end, the other pointer will be n steps behind
    
    Node fast = head;
    Node slow = head;
    
    while(n>0){
        fast = fast.next;                       // fast is moved by n steps
        n--;
    }                      
    
    while(fast.next!=null){                     // while fast is not tail basically. When fast.next = null, then it is tail.
        fast = fast.next;                       // the slow pointer is exactly n steps behind :)
        slow = slow.next;
    }
    
    return slow.data;


}
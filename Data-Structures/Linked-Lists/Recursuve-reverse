/*
  Reverse a linked list and return pointer to the head
  The input list will have at least one element  
  Node is defined as  
  class Node {
     int data;
     Node next;
  }
*/
    // This is a "method-only" submission. 
    // You only need to complete this method. 
    // i am going to solve this problem in a recursive way

Node Reverse(Node head) {
    

    // when list is empty or of size 1, return head
    if(head == null || head.next == null) return head;

    // points to rest of list
    Node rest = head.next;
    
    // reverses rest of list
    Node reversedRest = Reverse(rest);
    
    // once reversed, rest now points to head
    rest.next = head;
        
    // head now points to null
    head.next = null;
    
    return reversedRest;
}

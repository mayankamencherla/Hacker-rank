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
    Node node = new Node();             // create a new node;
    node.data = x;                      // assign the node's data to x
    
    node.next = head;                   // node.next is assigned to current head
    head = node;                        // node is now head
    
    return head;
}

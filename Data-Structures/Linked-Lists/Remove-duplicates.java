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
    
    Node node = head;
    
    while(node.next != null){
        if(node.data == node.next.data){
            Node temp = node.next.next;
            node.next.next = null;
            node.next = temp;
        }
        
        else node = node.next;
    }
 
    return head;
}
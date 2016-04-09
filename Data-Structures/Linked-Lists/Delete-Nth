/*
  Insert Node at the end of a linked list 
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
    
    Node node = new Node();
    
    if(position == 0){
        node = head.next;
        head = node;
    }
    
    else if(head == null){}
    
    else{
        node = head;
        while(--position>0){
            node = node.next;
        }
        
        Node temp = node.next.next;
        node.next = temp;
    }
    
    return head;

}

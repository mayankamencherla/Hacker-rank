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
    
    Node node = new Node();
    //node.data = data;
    
    if(head == null){
        node.data = data;
        head = node;
    } 
    
    else if(position ==0){
        node.data = data;
        node.next = head;
        head = node;
    }
    
    else{
        node = head;
        while(--position>0){                     // we want to traverse to the position-1 term and then insert at next
            node = node.next;
        }
        
        Node temp = node.next;
        node.next = new Node();
        node.next.data = data;
        node.next.next = temp;
    }
    return head;
}

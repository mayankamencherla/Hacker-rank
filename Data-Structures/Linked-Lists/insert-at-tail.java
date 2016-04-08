/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
Node Insert(Node head,int data) {
// This is a "method-only" submission. 
// You only need to complete this method. 
    
    if(head == null){
        head = new Node();
        head.data = data;
    }
    
    else{
        Node node = head;
    
        while(node.next != null){
            node = node.next;
        }
        
        // at this point node points to tail. And therefore, node.next = null
        // so I will create a new node, and assign that to tail.next. and tail.data = data

        node.next = new Node(); 
        node.next.data = data;
    }
    
    return head;
}

    
    return head;
}

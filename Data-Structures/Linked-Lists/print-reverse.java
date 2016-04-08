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

void ReversePrint(Node head) {
  // This is a "method-only" submission. 
  // You only need to complete this method. 
    
    Deque<Integer> deque = new LinkedList<Integer>();
    
    Node node = head;
    
    while(node != null){
        //System.out.println((Integer)node.data);
        deque.addFirst((Integer)node.data);
        node = node.next;
    }
    
    while(deque.size()>0){
        System.out.println(deque.getFirst());
        deque.removeFirst();
    }
    

}
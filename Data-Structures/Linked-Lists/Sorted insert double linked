/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
     Node prev;
  }
*/

Node SortedInsert(Node head,int data){
    
    Node n = new Node();
    n.data = data;                  // created new node with data to be inserted
    
    if (head == null) {             // base case for when head is a null
        return n;
    }
    
    else if (data <= head.data) {       // when data is less than head, therefore, must be inserted before head
        n.next = head;                  // first n.next = head
        head.prev = n;                  // head.prev is set to n
        return n;
    }
    
    else {
        Node rest = SortedInsert(head.next, data);          // base cases done, so we recursively call head.next
        head.next = rest;                                   // head.next = rest(sorted insert completed)
        rest.prev = head;                                   // rest.prev is set to head
        return head;
    }
}

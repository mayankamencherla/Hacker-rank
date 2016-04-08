/*
  Detect cycle in the list
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int HasCycle(Node head) {
    
    if(head == null) return 0;
    
    Node fast = head;
    Node slow = head;
   
    do{
        if(fast== null || slow == null) return 0;
            
        else{
            fast = fast.next.next;
            slow = slow.next;
        }
    } while(fast!=slow);   
    
    return 1;

}

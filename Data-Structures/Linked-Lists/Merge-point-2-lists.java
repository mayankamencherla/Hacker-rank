/*
  Insert Node at the end of a linked list 
  head pointer input could be NULL as well for empty list
  Node is defined as 
  class Node {
     int data;
     Node next;
  }
*/
int FindMergeNode(Node headA, Node headB) {
    // Complete this function
    // Do not write the main method. 
    
    // create two pointers and then jump from tail to the head to the other list.
    
    //int count =0;
    
    Node tempB = headB;
    Node tempA = headA;
    
    while(tempB != tempA){
        
        if(tempA.next == null) {tempA = headB;}
        
        else {tempA = tempA.next;}
        
        if(tempB.next == null) {tempB = headA;}
        
        else {tempB = tempB.next;}
    }
    
    return tempA.data;
    
}

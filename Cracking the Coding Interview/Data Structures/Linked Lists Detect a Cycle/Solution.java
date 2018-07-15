/*
Detect a cycle in a linked list. Note that the head pointer may be 'null' if the list is empty.

A Node is defined as: 
    class Node {
        int data;
        Node next;
    }
*/

//Tortoise and Hare algorithm
boolean hasCycle(Node head) {
    if (head == null) 
        return false;
    
    Node tortoise = head;
    Node hare = head.next;
    while (tortoise != hare) {
        if (hare == null || hare.next == null) 
            return false;
        
        tortoise = tortoise.next;
        hare = hare.next.next;
    }
    
    return true;
}
// a Singly Linked List

import java.io.*;
public class linkedList {
   
    Node head; 
    static class Node {
   
        int data;
        Node next;
    
        Node(int d)
        {
            data = d;
            next = null;
        }
    }
   
    public static linkedList insert(linkedList list, int data)
    {
        Node new_node = new Node(data);				// Create a new node with given data
        new_node.next = null;
   
       if (list.head == null) {				// If the Linked List is empty, then make the new node as head
            list.head = new_node;
        }
        else {							// Else traverse till the last node, and insert the new_node there
            Node last = list.head;
            while (last.next != null) {
                last = last.next;
            }
   
            last.next = new_node;				 // Insert the new_node at last node
        }
        return list;
    }
   

    public static void printList(linkedList list)
    {
        Node currNode = list.head;
    
        System.out.print("LinkedList: ");
            
            while (currNode != null) {			// Traverse through the LinkedList
            System.out.print(currNode.data + " ");	// Print the data at current node
             currNode = currNode.next;  			// Go to next node
        }
    }

    public static void main(String[] args)
    {
        linkedList list = new linkedList();        /* Start with the empty list. */
   
       
        list = insert(list, 3);
        list = insert(list, 2);
        list = insert(list, 1);
        list = insert(list, 4);
        list = insert(list, 5);
        list = insert(list, 8);
        list = insert(list, 7);
        list = insert(list, 6);
   
        printList(list);
    }
}

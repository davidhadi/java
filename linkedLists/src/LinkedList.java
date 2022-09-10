public class LinkedList {

    public Node head = null;

    static class Node {
        private final int data;
        private Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node reverse(){
        Node prev = null;
        Node current = head;
        while(current != null){
            Node temp = current.next;
            current.next = prev;
            prev = current;
            current = temp;
        }
        head = prev;
        return head;
    }

    private Node reverseList(){
        head = head.next;
        if(head == null || head.next == null) {
            return head;
        }

        Node newHead = reverseList();
        Node headNext = head.next;
        headNext.next = head;
        head.next = null;

        head = newHead;
        return head;
    }

    private Node addNode(int data) {

        Node newNode = new Node(data);

        if (head != null) {
            newNode.next = head;
        }
        head = newNode;
        return head;
    }

    private Node addNodeAtTheEnd(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
        }
        else {
            Node cur = head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = newNode;
        }
        return head;
    }


    private Node addAtPosition(int position, int data) {
        Node newNode = new Node(data);

        Node cur = head;
        Node prev = head;

        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        while (cur.next != null && --position > 0) {  // move element at position
            prev = cur;
            cur = cur.next;
        }

        prev.next = newNode;

        newNode.next = cur;

        return head;
    }

    private void print() {
        if (head == null) {
            System.out.println("The List is empty.");
        } else {
            System.out.println("LinkedList data are :");
            Node cur = head;
            while (cur != null) {
                System.out.print(cur.data + " -> ");
                cur = cur.next;
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        System.out.println("linked list .....");
        list.addNodeAtTheEnd(100);
        list.addNodeAtTheEnd(110);
        list.addNodeAtTheEnd(120);
        list.addNodeAtTheEnd(130);
        list.addNodeAtTheEnd(140);
        list.print();

        System.out.println("Reverse Linked list are : ");
        //list.reverse();
        list.reverseList();
        list.print();
    }
}
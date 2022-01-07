package SinglyLinkedList;

public class SinglyLinkedList {
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public Node head = null;
    public Node tail = null;


    public void add_node_first(int data) {
        Node newNode = new Node(data);
//        Node f = head;
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
    }


    public void add_node_last(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }


    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.print("null");
        System.out.println();
    }

    public void delete_node_first() {
        if (head == null) {
            System.out.println("list is Empty ");
            return;
        } else {
            if (head != tail) {
                head = head.next;
            } else {
                head = tail = null;
            }
        }
    }

    public void delete_last_node() {
        Node p = head;
        Node q = head.next;
        while (q.next != null) {
            p = p.next;
            q = q.next;
        }
        p.next = null;
    }

        Node node = head;
//        node = null;


    public static void main(String[] args) {
        SinglyLinkedList sl = new SinglyLinkedList();
        sl.add_node_first(10);
        sl.add_node_first(20);
        sl.add_node_first(210);
        sl.add_node_first(203);
        sl.add_node_first(205);
        sl.add_node_first(30);

        sl.printList();
//        System.out.print(" null ");
        sl.delete_last_node();

//        sl.delete_last_node();


        sl.printList();
//        System.out.print(" null ");
        sl.delete_node_first();
        sl.printList();
    }
}


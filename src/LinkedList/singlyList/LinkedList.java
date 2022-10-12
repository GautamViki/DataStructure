package LinkedList.singlyList;

public class LinkedList {
    private Node head;

    public static void main(String[] args) {
        Node node = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        LinkedList linkedList = new LinkedList();
        linkedList.head = node;
        node.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        linkedList.printList();
        linkedList.addAtFirst(100);
        linkedList.addAtLast(200);
        linkedList.addAtGivenPosition(3, 300);
    }

    public void printList() {

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.println("null");
        System.out.println();
    }

    public void addAtFirst(int data) {
        System.out.println("Add  at first");
        Node node = new Node(data);
        node.next = head;
        head = node;
        printList();
    }

    public void addAtLast(int data) {
        System.out.println("Add at last");
        Node node = new Node(data);
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = node;
        printList();
    }

    public void addAtGivenPosition(int pos, int data) {
        System.out.println("Add at given Position");
        Node node = new Node(data);
        Node current = head;
        int count = 0;
        while (count < pos - 1) {
            System.out.println(current.data);
            count++;
            current = current.next;

        }
        System.out.println(count);
    }

    private static class Node {
        private int data;
        private Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }


}

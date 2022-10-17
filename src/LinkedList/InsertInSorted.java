package LinkedList;

public class InsertInSorted {
    private LinkedList head;

    public static void main(String[] args) {
        InsertInSorted insert = new InsertInSorted();
        LinkedList node1 = new LinkedList(10);
        LinkedList node2 = new LinkedList(20);
        LinkedList node3 = new LinkedList(30);
        LinkedList node4 = new LinkedList(40);
        LinkedList node5 = new LinkedList(50);

        insert.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;

        insert.printNode();
        insert.insertSortedArray(35);
    }

    public void printNode() {
        LinkedList current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }

    public void insertSortedArray(int data) {
        System.out.println();
        LinkedList current = head;
        LinkedList temp = null;
        while (current != null && current.data < data) {
            temp = current;
            current = current.next;
        }
        LinkedList node = new LinkedList(data);
        node.next = current;
        temp.next = node;
        printNode();
    }

    static class LinkedList {
        private int data;
        private LinkedList next;

        public LinkedList(int data) {
            this.data = data;
        }
    }
}

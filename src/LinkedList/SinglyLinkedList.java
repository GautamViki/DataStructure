package LinkedList;

public class SinglyLinkedList {
    private LinkedList head;

    public static void main(String[] args) {
        SinglyLinkedList sll = new SinglyLinkedList();

//        Create Node;
        sll.head = new LinkedList(10);
        LinkedList second = new LinkedList(20);
        LinkedList third = new LinkedList(30);
        LinkedList fourth = new LinkedList(40);
        LinkedList fifth = new LinkedList(50);
        LinkedList six = new LinkedList(60);

//        Connect all node together
        sll.head.next = second;
        second.next = third;
        third.next = fourth;
        fourth.next = fifth;
        fifth.next = six;
        System.out.println();

//        display node
        System.out.println("Print node");
        sll.printNode();
        System.out.println();

//        print size
        System.out.println("print size");
        sll.findSize();
        System.out.println();

//        insert at first
        System.out.println("Add node at first");
        sll.addAtFirst(100);
        System.out.println();

//        insert at last
        System.out.println("Add node at Last");
        sll.addAtLast(110);
        System.out.println();

//        insert at given position
        System.out.println("Add node at given Position");
        sll.addAtGivenPosition(130, 3);
        System.out.println();

//       delete first node
        System.out.println("Delete from first");
        sll.deleteFirstNode();
        System.out.println();

//      delete from last
        System.out.println("Delete from last");
        sll.deleteFromLast();
        System.out.println();

//        delete from given position
        System.out.println("delete from given position");
        sll.deleteFromGivenPosition(3);
        System.out.println();

//        search node
        System.out.println("Search node : " + 30);
        sll.searchNode(30);
        System.out.println();

//        Middle node
        sll.getMiddleNode();
        System.out.println();

//        get Nth node from end
        sll.getNthNode(2);
        System.out.println();

        //        reverse list
        sll.reverseList();
        System.out.println();

        sll.deleteGivenKey(30);
    }

    public void printNode() {
        LinkedList current = head;
        while (current != null) {
            System.out.print(current.data + " => ");
            current = current.next;
        }
        System.out.println("null");
    }

    public void findSize() {
        LinkedList current = head;
        int size = 0;
        while (current != null) {
            size++;
            current = current.next;
        }
        System.out.println("Size of list = " + size);
    }

    public void addAtFirst(int data) {
        LinkedList node = new LinkedList(data);
        node.next = head;
        head = node;
        printNode();
        System.out.println("Added data = " + data);
        findSize();
    }

    public void addAtLast(int data) {
        LinkedList node = new LinkedList(data);
        LinkedList current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = node;
        printNode();
        System.out.println("Added data = " + data);
        findSize();
    }

    public void addAtGivenPosition(int data, int pos) {
        LinkedList node = new LinkedList(data);
        LinkedList previous = head;
        int count = 1;
        while (count < pos - 1) {
            previous = previous.next;
            count++;
        }
        LinkedList cur = previous.next;
        previous.next = node;
        node.next = cur;
        printNode();
        System.out.println("Added Node = " + data + "     Position = " + pos);
        findSize();
    }

    public void deleteFirstNode() {
        LinkedList current = head;
        head = current.next;
        printNode();
        System.out.println("deleted node = " + current.data);
        findSize();
    }

    public void deleteFromLast() {
        LinkedList current = head;
        LinkedList pre = null;
        while (current.next != null) {
            pre = current;
            current = current.next;
        }
        pre.next = null;
        printNode();
        System.out.println("deleted Node = " + current.data);
        findSize();
    }

    public void deleteFromGivenPosition(int pos) {
        int count = 1;
        LinkedList previous = head;
        while (count < pos - 1) {
            previous = previous.next;
            count++;
        }
        LinkedList after = previous.next;
        previous.next = previous.next.next;
        printNode();
        System.out.println("Deleted data = " + after.data + "      position = " + pos);
        findSize();
    }

    public void deleteGivenKey(int key) {
        System.out.println("Delete a given key \n");
        LinkedList temp = null;
        LinkedList current = head;
        while (current != null && current.data != key) {
            temp = current;
            current = current.next;
        }
        if (current == null) return;
        temp.next = current.next;
        printNode();
    }

    public void searchNode(int data) {
        LinkedList current = head;
        int idx = -1;
        int count = 1;
        while (current != null) {
            if (current.data == data) {
                idx = count;
            }
            count++;
            current = current.next;
        }
        printNode();
        System.out.println("Search index = " + idx);
        findSize();
    }

    public void getMiddleNode() {
        LinkedList slow = head;
        LinkedList fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        printNode();
        findSize();
        System.out.println("Middle node = " + slow.data);
    }

    public void getNthNode(int n) {
        LinkedList ref = head;
        LinkedList main = head;
        int count = 0;
        while (count < n) {
            ref = ref.next;
            count++;
        }
        while (ref != null) {
            ref = ref.next;
            main = main.next;
        }
        printNode();
        findSize();
        System.out.println(n + "th node from end = " + main.data);
    }

    public void reverseList() {
        LinkedList current = head;
        LinkedList previous = null;
        LinkedList next = null;
        printNode();
        while (current != null) {
            next = current.next;
            current.next = previous;
            previous = current;
            current = next;
        }
        head = previous;
        System.out.println("Reversed List");
        printNode();
        findSize();
    }

    private static class LinkedList {
        private int data;
        private LinkedList next;

        public LinkedList(int data) {
            this.data = data;
            this.next = null;
        }
    }
}

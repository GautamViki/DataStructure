package LinkedList;

public class DetectLoopInList {
    private ListNode head;

    public static void main(String[] args) {
        DetectLoopInList list = new DetectLoopInList();
        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node6 = new ListNode(6);
        ListNode node7 = new ListNode(7);
        ListNode node8 = new ListNode(8);

        list.head = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node7;
        node7.next = node8;
        node8.next = node5;

        list.printList();
        System.out.println(list.detectLoop());
        System.out.println(list.getStartPointOfLoop().data);
    }

    public void printList() {
        ListNode current = head;
        int count = 0;
        while (current != null) {
            System.out.print(current.data + " ");
            count++;
            if (count == 15) {
                System.out.println();
                return;
            }
            current = current.next;
        }
    }

    public boolean detectLoop() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return true;
            }
        }
        return false;
    }

    public ListNode getStartPointOfLoop() {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                return findStartPoint(slow);
            }
        }
        return null;
    }

    private ListNode findStartPoint(ListNode slow) {
        ListNode temp = head;
        while (temp != slow) {
            temp = temp.next;
            slow = slow.next;
        }
        return temp;
    }

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
        }
    }
}

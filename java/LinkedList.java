/**
 * Created by gungr on 16/11/2016.
 */
public class LinkedList {

    public class ListNode {
        ListNode next = null;
        int data;

        public ListNode(int val) {
            data = val;
        }

        public void appendToTail(int val) {
            ListNode end = new ListNode(val);
            ListNode n = this;
            while(n.next != null) {
                n = n.next;
            }
            n.next = end;
        }
    }

    // Given the head, delete the first node contains value d
    public ListNode deleteNode1(ListNode head, int d) {
        if(head == null) return head;

        ListNode cur = head;
//        if(cur.data == d) return head.next;

        while(cur.next != null) {
            if(cur.next.data == d) {
                cur.next = cur.next.next;
                return head;
            }
            cur = cur.next;
        }
        return head;
    }

    // Given the node you want to delete
    public void deleteNode2(ListNode n) {
        n.data = n.next.data;
        n.next = n.next.next;
    }

    public ListNode removeElements(ListNode head, int val) {
        if(head == null) return head;

        while(head != null && head.data == val)
            head = head.next;

        ListNode cur = head;
        while(cur != null) {
            ListNode next = cur.next;
            while(next != null && next.data == val)
                next = next.next;
            cur.next = next;
            cur = cur.next;
        }
        return head;
    }
}

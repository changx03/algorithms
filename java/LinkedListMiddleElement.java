/**
 * Created by gungr on 16/11/2016.
 */
public class LinkedListMiddleElement {

    public static class ListNode {
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

    public static int middleValSinglePass(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        int count = 0;
        while(fast != null) {
            slow = slow.next;
            fast = fast.next.next;
            count++;
        }
        System.out.println("count = " + count);
        return slow.data;
    }

    public static ListNode getKthLastElement(ListNode head, int k) {
        if(head == null || k < 1) return null;
        ListNode cur = head;
        ListNode kBehind = head;
        for(int i = 0; i < k - 1; i++) {
            cur = cur.next;
            if(cur == null) return null;
        }
        while(cur.next != null) {
//            System.out.println(cur.data);
            kBehind = kBehind.next;
            cur = cur.next;
        }
        return kBehind;
    }

    public static void main(String[] args) {
        LinkedListMiddleElement.ListNode node = new LinkedListMiddleElement.ListNode(0);
        for(int i = 1; i < 10; i++) {
            node.appendToTail(i);
        }
        System.out.println(middleValSinglePass(node));

        System.out.println(getKthLastElement(node, 4).data);
    }
}

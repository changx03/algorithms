/**
 * Created by gungr on 15/11/2016.
 */
public class RemoveDuplicatesFromSortedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
        if (head.next == null) return head;
        ListNode cur = head;
        ListNode root;
        while (cur != null) {
            if (cur.next != null && cur.val == cur.next.val) {
                root = cur;
                while (root.next != null && root.val == root.next.val)
                    root = root.next;
                cur.next = root.next;
            }
            cur = cur.next;
        }
        return head;
    }

}

/**
 * Created by gungr on 11/12/2016.
 */
public class OddEvenList {
    public static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static ListNode oddEvenList1(ListNode head) {
        if (head == null) return head;
        ListNode even = new ListNode(0);
        ListNode evenHead = even;
        ListNode cur = head;
        while (cur.val % 2 == 0) {
            even.next = cur;
            even = even.next;
        }
        while (cur.next != null && cur.next.next != null) {
            if (cur.next.val % 2 == 0) {
                even.next = cur.next;
                even = even.next;
                cur.next = cur.next.next;
            }
            cur = cur.next;
        }
        cur.next = evenHead.next;
        return head;
    }

    /**
     * LeetCode 328. Odd Even Linked List
     * The list is separated by order rather than value..
     * @param head
     * @return
     */
    public static ListNode oddEvenList(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode cur = head.next;
        ListNode insertPt = head;
        while (cur != null && cur.next != null) {
            ListNode next = cur.next;
            cur.next = cur.next.next;
            next.next = insertPt.next;
            insertPt.next = next;
            insertPt = insertPt.next;
            cur = cur.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode nums = new ListNode(0);
        ListNode cur = nums;
        int[] numsArr = {1, 2, 3, 4, 5, 6, 7, 8};
        for (int i = 0; i < numsArr.length; i++) {
            cur.next = new ListNode(numsArr[i]);
            cur = cur.next;
        }
//        ListNode output = OddEvenList.oddEvenList1(nums);

        ListNode output2 = OddEvenList.oddEvenList(nums.next);
    }
}

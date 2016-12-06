/**
 * Created by gungr on 6/12/2016.
 */
public class SortList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public ListNode sortList(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode fast = head.next.next; // offset by 2
        ListNode slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        ListNode h2 = sortList(slow.next);  // sort the second half
        slow.next = null;   // set the breaking point
        return merge(sortList(head), h2);
    }

    private ListNode merge(ListNode h1, ListNode h2) {
        ListNode sortedList = new ListNode(0);  // create a dummy head
        ListNode sortedHead = sortedList;
        while (h1 != null && h2 != null) {
            if (h1.val < h2.val) {
                sortedList.next = h1;
                h1 = h1.next;
            } else {
                sortedList.next = h2;
                h2 = h2.next;
            }
            sortedList = sortedList.next;
        }
        sortedList.next = (h1 != null) ? h1 : h2;
        return sortedHead.next; // remove dummy head
    }

    public static void main(String[] args) {
        int[] nums = {6, 5, 3, 1, 8, 7, 2, 4};
        ListNode myList = new ListNode(nums[0]);
        ListNode cur = myList;
        for (int i = 1; i < nums.length; i++) {
            cur.next = new ListNode(nums[i]);
            cur = cur.next;
        }

        SortList myClass = new SortList();
        System.out.println(myClass.sortList(myList).val);
    }
}

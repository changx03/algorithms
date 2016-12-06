/**
 * Created by gungr on 6/12/2016.
 */
public class MiddleOfLinkedList {
    public static class ListNode{
        public int val;
        public ListNode next;
        public ListNode(int x) { val = x; }
    }

    public static int middleVlaueSinglePass(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow.val;
    }

    public static void main(String[] args) {
        int[] nums = {6,5,3,1,8,7,2,4};
        ListNode myList = new ListNode(nums[0]);
        ListNode cur = myList;
        for(int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            cur.next = temp;
            cur = cur.next;
        }
        System.out.println(MiddleOfLinkedList.middleVlaueSinglePass(myList));   // return 8
    }
}

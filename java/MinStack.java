/**
 * Created by gungr on 20/11/2016.
 */
public class MinStack {

    // LeetCode 155 Min Stack constant time O(1)
    private Node first;

    private class Node {
        private int val;
        private int min = Integer.MAX_VALUE;
        private Node next;
    }

    public MinStack() {
        first = null;
    }

    public void push(int x) {
        Node temp = new Node();
        temp.val = x;
        temp.min = (this.first == null) ? x : Math.min(x, first.min);
        temp.next = this.first;
        this.first = temp;
    }

    public void pop() {
        if (first != null)
            first = first.next;
    }

    public int top() {
        if (first == null)
            return 0;
        else
            return first.val;
    }

    public int getMin() {
        if (first == null)
            return 0;
        else
            return first.min;
    }

    public static void main(String[] args) {
        MinStack obj = new MinStack();
        obj.push(-2);
        obj.push(0);
        obj.push(-3);
        System.out.println(obj.getMin());
        obj.pop();
        System.out.println(obj.top());
        System.out.println(obj.getMin());
    }
}

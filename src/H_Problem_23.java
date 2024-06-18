import java.util.PriorityQueue;

public class H_Problem_23 {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (ListNode list : lists) {
            while (list != null) {
                pq.add(list.val);
                list = list.next;
            }
        }
        ListNode head = null;
        ListNode tail = null;
        while (!pq.isEmpty()) {
            ListNode newNode = new ListNode(pq.poll());
            if (head == null) {
                head = newNode;
            } else {
                tail.next = newNode;
            }
            tail = newNode;
        }
        return head;
    }
}

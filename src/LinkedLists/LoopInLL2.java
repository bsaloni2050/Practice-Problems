package LinkedLists;

/**
 * Created by salonibindra on 1/17/17.
 */
public class LoopInLL2 {

    public static ListNode findLoop1(ListNode head) {
        ListNode fast = head;
        ListNode slow = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                break;
            }
        }
        if (fast == null && fast.next == null) {
            return null;
        }

        slow = head;
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
        }

        return slow;

    }


    public static void main(String[] args) {
        ListNode head = new ListNode<>(1);
        head.next = new ListNode<>(2);
        ListNode intersect = new ListNode<>(3);
        head.next.next = intersect;
        head.next.next.next = new ListNode<>(4);
        head.next.next.next.next = new ListNode<>(5);
        head.next.next.next.next.next = intersect;
        // head.next.next.next.next.next.next =  new ListNode<>(6);
//        while (head != null) {
//            System.out.print(head.data + "--");
//            head = head.next;
//        }
//        System.out.println();

        System.out.println(head.next.next.next.next.next.data);
        System.out.println(findLoop1(head).data);
    }
}

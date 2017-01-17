package LinkedLists;


import java.util.HashSet;

/**
 * Created by salonibindra on 1/17/17.
 */
public class LoopInLL {
    public static ListNode findLoop(ListNode head){
        ListNode fast =head;
        ListNode slow = head;

        while (fast != null && fast.next != null){
            slow=slow.next;
            fast=fast.next.next;
            if (slow==fast)
                return fast;

        } return null;
    }

    public static ListNode findLoopHashSet (ListNode head){
        HashSet<ListNode> hs = new HashSet<>();
        ListNode pointer =head;
        while (pointer.next != null){
            if (hs.contains(pointer)){
                return pointer;
            }
            else {
                hs.add(pointer);
            }
            pointer=pointer.next;

        }
        return null;

    }

    public static void main(String[] args) {
        ListNode head = new ListNode<>(1);
        head.next=  new ListNode<>(2);
        ListNode intersect = new ListNode<>(3);
        head.next.next = intersect;
        head.next.next.next =  new ListNode<>(4);
        head.next.next.next.next =  new ListNode<>(5);
        head.next.next.next.next.next =intersect;


       System.out.println(head.next.next.next.next.next.data);
        System.out.println(findLoop(head).data);
        System.out.println(findLoopHashSet(head).data);
    }
}

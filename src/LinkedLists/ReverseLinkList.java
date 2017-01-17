package LinkedLists;


interface Node<T> {

    public void setNext(ListNode<T> next);

    public void setData(T data);

    public ListNode<T> getNext();

    public T getData();

}

class ListNode<T> implements Node<T> {

    ListNode<T> next;
    T data;
    boolean val;

    ListNode(T newData) {
        next = null;
        data = newData;
    }

    ListNode(T new_data, ListNode<T> new_next) {
        next = new_next;
        data = new_data;
    }

    @Override
    public void setNext(ListNode<T> next) {
        this.next = next;
    }

    @Override
    public void setData(T data) {
        this.data = data;
    }

    @Override
    public ListNode<T> getNext() {
        return next;
    }

    @Override
    public T getData() {
        return data;
    }
}

class LinkedList<T> {
    ListNode<T> head;


    ListNode<T> tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public ListNode<T> getHead() {
        return head;
    }

    public void insert(ListNode<T> node) {
        if (head == null) {
            head = node;
            tail = node;
        } else {
            tail.setNext(node);
            tail = tail.getNext();
        }
    }
}


public class ReverseLinkList {
    public static ListNode iterativeLLRev(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode first = head;
        ListNode second = head.next;
        head.next = null;

        while (first != null && second != null) {
            ListNode temp = second.next;
            second.next = first;
            first = second;
            if (temp == null)
                return second;
            else
                second = temp;
        }
        return second;
    }

    public static ListNode recursiveLLRev(ListNode head) {
        if (head == null || head.next == null)
            return head;

        ListNode node2 = head.next;
        head.next = null;
        ListNode other_nodes = recursiveLLRev(node2);
        node2.next = head;
        return other_nodes;
    }


    public static void displayLL(ListNode head) {
        while (head != null) {
            System.out.print(head.data + "--");
            head = head.next;
        }
        System.out.println();
    }


    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<>();
        llist.insert(new ListNode<>(1));
        llist.insert(new ListNode<>(2));
        llist.insert(new ListNode<>(3));
        llist.insert(new ListNode<>(4));
        // System.out.println(llist.getHead().data);
        ListNode rev_solutioni = iterativeLLRev(llist.getHead());
        displayLL(rev_solutioni);
//        ListNode rev_solutionr1 = recursiveLLRev(llist.getHead());
//        displayLL(rev_solutionr1);

        LinkedList<Integer> llist2 = new LinkedList<>();
        llist2.insert(new ListNode<>(1));
        llist2.insert(new ListNode<>(2));
        llist2.insert(new ListNode<>(3));
        llist2.insert(new ListNode<>(4));

        ListNode rev_solutionr = recursiveLLRev(llist2.getHead());
        displayLL(rev_solutionr);


    }
}

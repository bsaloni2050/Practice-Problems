import java.util.LinkedList;

class ListNode {
	int val;
	ListNode next;

	ListNode(int x) {
		val = x;
	}
}

public class TwoNumbers {

	public static void main(String rgs[]) {

		System.out.println("Here main ");
		ListNode l11 = new ListNode(1);
		ListNode l12 = new ListNode(8);
		ListNode l13 = new ListNode(3);
		l11.next = l12;
//		l12.next = l13;

		LinkedList<ListNode> list1 = new LinkedList<>();
		list1.add(l11);
		list1.add(l12);
		list1.add(l13);

		ListNode l21 = new ListNode(0);
		ListNode l22 = new ListNode(8);
		ListNode l23 = new ListNode(4);
//		l21.next = l22;
//		l22.next = l23;

		LinkedList<ListNode> list2 = new LinkedList<>();
		list2.add(l21);
		list2.add(l22);
		list2.add(l23);
//	
//		ListNode result = addTwoNumbers(l11, l21);
		ListNode result = twoNumbersMethodTwo(l11, l21);


		while (result != null) {
			System.out.print(result.val + "--");
			result=result.next;;
		}
	}
public static ListNode twoNumbersMethodTwo(ListNode l1, ListNode l2){
	ListNode headd = new ListNode(0);
	ListNode headn = headd;
	ListNode p = l1;
	ListNode q = l2;
	int carry =0;
	
	while (p!= null || q!= null){
		int sum=0;
		sum+= (p==null?0:p.val);
		sum+= (q==null?0:q.val);
		sum+=carry;
		carry=sum/10;
		headn.next = new ListNode(sum%10);
		headn = headn.next;
		if(p!=null)
			p=p.next;
		if(q!= null)
			q=q.next;
		
		
	}
	
	if(carry>0){
		headn.next = new ListNode(1);
	}
	return headd.next;
}
	
	
	
	
	
	
	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		
//		while (l1 != null) {
//			System.out.print(l1.val + "--");
//			l1=l1.next;;
//		}
//		while (l2 != null) {
//			System.out.print(l2.val + "--");
//			l2=l2.next;;
//		}
//		
		int carry = 0;
		int sum = 0;
		ListNode result = null;
		ListNode head = null;

		while (l1 != null && l2 != null) {
			sum = l1.val + l2.val + carry;
			System.out.println("Sum  "+sum);

			carry = 0;
			if (sum > 9) {
				carry = 1;
				sum = sum % 10;
			}
			ListNode elem = new ListNode(sum);
			System.out.println(elem.val+" for sum of "+sum);
			if (result != null) {
				result.next = elem;
				System.out.println("result  "+result.next.val);
				result=result.next;

			} else {
				result = elem;
				head=elem;
				System.out.println("result  "+result.val);

			}
			sum = 0;
			l1 = l1.next;
			l2 = l2.next;

		}
		if(carry==1)
			result.next = new ListNode(1);
		
		while(l1!=null){
			result.next=l1;
			l1=l1.next;
			result=result.next;
			
		}
		while(l2!=null){
			result.next=l2;
			l2=l2.next;
			result=result.next;
			
		}
		
		return head;

	}
}

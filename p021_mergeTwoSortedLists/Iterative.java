package p021_mergeTwoSortedLists;


class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}


public class Iterative {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy=new ListNode(0);
        ListNode cur=dummy;
		//比較大小並排續
        while(list1 != null && list2 !=null) {
			if (list1.val>list2.val) {
				cur.next=list2;
				list2=list2.next;
				cur=cur.next;
			}else {
				cur.next=list1;
				list1=list1.next;
				cur=cur.next;
			}
        }
		//如果還沒走完 走完剩下的
		if (list2 !=null) cur.next=list2;
		if (list1 !=null) cur.next=list1;
			
		
		return dummy.next;
    }
	
	public static void main(String[] args) {
		ListNode list1=new ListNode(1,(new ListNode(2,(new ListNode(4)))));
		ListNode list2=new ListNode(1,(new ListNode(3,(new ListNode(4)))));
		
		Iterative s1=new Iterative();
		ListNode newList=s1.mergeTwoLists(list1, list2);
		
		//打印驗證
		ListNode current=newList;
		while (current != null) {
			System.out.print(current.val);
			current=current.next;
		}
	}
}

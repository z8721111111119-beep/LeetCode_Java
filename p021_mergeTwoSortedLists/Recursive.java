package p021_mergeTwoSortedLists;

public class Recursive {
	
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		//base case
		if (list1==null)return list2;
		if (list2==null)return list1;
		if(list1.val>=list2.val) {
			list2.next=mergeTwoLists(list1, list2.next);
			return list2 ;
		}else {
			list1.next=mergeTwoLists(list1.next, list2);
			return list1 ;	
		}
    }
	
	public static void main(String[] args) {
		ListNode list1=new ListNode(1,(new ListNode(2,(new ListNode(4)))));
		ListNode list2=new ListNode(1,(new ListNode(3,(new ListNode(4)))));
		
		Recursive s1=new Recursive();
		ListNode newList=s1.mergeTwoLists(list1, list2);
		
		//打印驗證
		ListNode current=newList;
		while (current != null) {
			System.out.print(current.val);
			current=current.next;
		}
	}
}

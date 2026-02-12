package p021_mergeTwoSortedLists;

public class Recursive {
	public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
		mergeTwoLists(list1, list2)
		
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

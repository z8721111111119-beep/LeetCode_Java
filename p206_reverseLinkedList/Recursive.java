package p206_reverseLinkedList;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Recursive {	
	
	public ListNode reverseList(ListNode head) {
		//base case
		if(head == null || head.next==null) return head;
		//找到最尾的節點
		ListNode newHead=reverseList(head.next);
		//下個連到自己 例如5->4
		head.next.next=head;
		//自己段開原本連接的下個節點 例如 4->null
		head.next=null;
		
		return newHead;
	}
	
	
	public static void main(String[] args) {
		ListNode dummy = new ListNode(0);//建立假頭
		ListNode current=dummy;			 //現在節點(遍歷用)
		
		for(int i=1;i<=5;i++) {			 //新增3個節點並賦予值
			current.next=new ListNode(i);//新增下個節點並賦予值
			current=current.next;   	 //跳至下個節點	
		}
		//        head
		//dummy(0)->1->2->3->4->5->null
		ListNode head = dummy.next; //頭節點 為假頭的下個節點
		
		Recursive s1=new Recursive();
		
		current=head;
		current=s1.reverseList(head);
		while(current != null) {
			System.out.print(current.val);
			current=current.next;
		}
	}
}

package p206_reverseLinkedList;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class Iterative {	
	
	public ListNode reverseList(ListNode head) {
		ListNode cur=head,nextTemp,prev=null;
		while(cur !=null) {
		    nextTemp = cur.next; // 暫存下一個
		    cur.next = prev;     // 反轉指向
		    prev = cur;          // prev 前進
		    cur = nextTemp;      // cur 前進	  
		}
		//null->5->4->3->2->1->null
		return prev;
	}
	
	
	public static void main(String[] args) {
		ListNode dummy = new ListNode(0);//建立假頭
		ListNode current=dummy;			 //現在節點(遍歷用)
		for(int i=1;i<=5;i++) {			 //新增3個節點並賦予值
			current.next=new ListNode(i);//新增下個節點並賦予值
			current=current.next;   	 //跳至下個節點	
		}
		//打印 確認節點
		ListNode head = dummy.next; //頭節點 為假頭的下個節點
		
		Iterative s1=new Iterative();
		
		current=head;
		current=s1.reverseList(head);
		while(current != null) {
			System.out.print(current.val);
			current=current.next;
		}
	}
}

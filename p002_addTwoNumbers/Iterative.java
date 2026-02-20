package p002_addTwoNumbers;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}

public class Iterative {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		int carry=0;//進位符
		ListNode dummy = new ListNode(),cur=dummy;
		while(l1 !=null || l2 !=null) {
			//如果不是空 =val  如果空=0
			int l1Val=(l1 != null)? l1.val : 0 ;
			int l2Val=(l2 != null)? l2.val : 0 ;
			int sum=(l1Val+l2Val+carry);
			cur.next=new ListNode(sum%10);
			carry=sum/10;
			cur=cur.next;
			if(l1 !=null)  l1=l1.next;
			if(l2 !=null)  l2=l2.next;
		}
		if (carry>0) {
			cur.next=new ListNode(carry);
		}
		return dummy.next;
    }
	
	public static void main(String[] args) {
		ListNode l1=new ListNode(2,new ListNode(4,new ListNode(3))); 
		ListNode l2=new ListNode(5,new ListNode(6,new ListNode(4)));
		
		Iterative s1= new Iterative();
		ListNode res  = s1.addTwoNumbers(l1,l2);
				
		//打印
		ListNode cur = res;
		while(cur != null) {
			System.out.print(cur.val+",");
			cur=cur.next;
		}
	}
}
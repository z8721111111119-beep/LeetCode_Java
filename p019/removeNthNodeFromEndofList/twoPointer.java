package p019.removeNthNodeFromEndofList;

public class twoPointer {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ListNode dummy=new ListNode();
	        dummy.next=head;
	        ListNode left=dummy,right=head;
	        //right從head先走n-1步
	        for (int i=0;i<n-1;i++) {
	        	right=right.next;
	        }
	        //right走到尾 此時left的下個節點為刪除點
	        while (right.next != null) {
	        	right=right.next;
	        	left=left.next;
	        	}
	        //此時left指向 刪除點的下個點
	        left.next=left.next.next;
	        return dummy.next;
	    }
	
	public static void main(String[] args) {
		int[] list=new int[] {1};
		int n = 1;
		//建立陣列 之後做串列
		ListNode[] listNodes=new ListNode[list.length];
		//建立node
		for(int i=0;i<list.length;i++) {
			listNodes[i]=new ListNode(list[i]);
		}
		//依序連接
		for(int i=0;i<list.length-1;i++) {
			listNodes[i].next=listNodes[i+1];
		}
		//建頭部
		ListNode head=listNodes[0];
		
		twoPointer s1= new twoPointer();
		ListNode res  = s1.removeNthFromEnd(head, n);
				
		//打印
		ListNode cur = res;
		while(cur != null) {
			System.out.print(cur.val+",");
			cur=cur.next;
		}
	}
}

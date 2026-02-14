package p141_linkedListCycle;



public class FlotdCycleDetection {
	public boolean hasCycle(ListNode head) {
        ListNode fast=head,slow=head;
        while (fast !=null) {
        	fast=fast.next.next;
        	slow=slow.next;
        	if(fast == slow) {
        		return true;
        	}
        }
        return false;
    }

	public static void main(String[] args) {
		//head = [3,2,0,-4], pos = 1
		int[] headLists=new int[] {3,2,0,-4};
		int pos=1;
		//建立陣列 之後做串列
		ListNode[] listNodes=new ListNode[4];
		//建立node
		for(int i=0;i<4;i++) {
			listNodes[i]=new ListNode(headLists[i]);
		}
		//依序連接
		for(int i=0;i<3;i++) {
			listNodes[i].next=listNodes[i+1];
		}
		//pos循環連接
		listNodes[headLists.length-1].next=listNodes[pos];
		//令頭節點
		ListNode head=listNodes[0],cur=head;
		
		FlotdCycleDetection s2= new FlotdCycleDetection();
		boolean res = s2.hasCycle(head);
		System.out.print(res);
		
		//打印驗證
		/*
		while(cur != null) {
			System.out.print(cur.val+",");
			cur=cur.next;
		}
		*/
	}

}

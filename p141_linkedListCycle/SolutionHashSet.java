package p141_linkedListCycle;

import java.util.HashSet;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}


public class SolutionHashSet {
	public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet=new HashSet<>();
        while(head !=null) {
        	if (hashSet.contains(head)) {
        		return true;
        	}
    		hashSet.add(head);
    		head=head.next;
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
		SolutionHashSet s1=new SolutionHashSet();
		boolean res = s1.hasCycle(head);
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
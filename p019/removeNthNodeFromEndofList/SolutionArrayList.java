package p019.removeNthNodeFromEndofList;

import java.util.ArrayList;

class ListNode {
	int val;
	ListNode next;
	ListNode() {}
	ListNode(int val) { this.val = val; }
	ListNode(int val, ListNode next) { this.val = val; this.next = next;}
}

public class SolutionArrayList {
	 public ListNode removeNthFromEnd(ListNode head, int n) {
	        ArrayList<ListNode> array= new ArrayList<>();
	        //假頭 存array   index=0
	        ListNode dummy=new ListNode();
	        array.add(dummy);
	        //假頭 連head
	        dummy.next=head;
	        //head 存array
	        while (head != null) {
	        	array.add(head);
	        	head=head.next;
	        }
	        //移除n 為當前array的索引位置index
	        int index=array.size()-n;
	        
	        //移除n節點(前節點指向後節點)
	        if(n==1) {
	        	array.get(index-1).next=null;
	        }else {
	        	array.get(index-1).next=array.get(index+1);
	        }	        
	        //假頭的下一個
	        return array.get(0).next;
	        
	        
	    }
	
	public static void main(String[] args) {
		int[] list=new int[] {1,2};
		int n = 2;
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
		
		SolutionArrayList s1= new SolutionArrayList();
		ListNode res  = s1.removeNthFromEnd(head, n);
				
		//打印
		ListNode cur = res;
		while(cur != null) {
			System.out.print(cur.val+",");
			cur=cur.next;
		}
	}
}

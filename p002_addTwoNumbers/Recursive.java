package p002_addTwoNumbers;

public class Recursive {

	// 外部呼叫入口，直接傳入兩個鏈表
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		// 從遞迴方法開始，加上初始進位 0
		return add(l1, l2, 0);
	}

	// 遞迴方法：傳入兩個鏈表節點 + 進位 carry
	private ListNode add(ListNode l1, ListNode l2, int carry) {
		// 遞迴終止條件：
		// 當兩個鏈表都遍歷完，且進位為 0 時，停止遞迴
		if (l1 == null && l2 == null && carry == 0)
			return null;

		// 取得當前節點值，如果為 null 就設為 0
		int val1 = (l1 != null) ? l1.val : 0;
		int val2 = (l2 != null) ? l2.val : 0;

		// 計算當前位數的總和
		int sum = val1 + val2 + carry;

		// 建立當前位的新節點（只保留個位數）
		ListNode node = new ListNode(sum % 10);

		// 更新進位，供下一層遞迴使用
		carry = sum / 10;

		// 遞迴呼叫下一個節點
		// 如果節點為 null，就傳 null，進位 carry 繼續傳下去
		node.next = add((l1 != null) ? l1.next : null, (l2 != null) ? l2.next : null, carry);

		// 回傳這個節點，鏈接上一層
		return node;
	}

	public static void main(String[] args) {
		// 範例鏈表
		ListNode l1 = new ListNode(2); // l1 = [2]
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4))); // l2 = [5,6,4]

		Recursive s1 = new Recursive();
		ListNode res = s1.addTwoNumbers(l1, l2);

		// 打印結果
		ListNode cur = res;
		while (cur != null) {
			System.out.print(cur.val);
			if (cur.next != null)
				System.out.print(","); // 格式化輸出，最後不要多逗號
			cur = cur.next;
		}
	}
}

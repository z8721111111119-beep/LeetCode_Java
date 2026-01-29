package p001_twoSum;

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int num1, num2;
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				num1 = nums[i];
				num2 = nums[j];
				if (num1 + num2 == target) {
					return new int[] { i, j };
				}
			}
		}
		return new int[] {};
	}
}

public class TwoSum_bruteForce {

	public static void main(String[] args) {
		Solution s1 = new Solution();
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		int[] res = s1.twoSum(nums, target);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

}

package P011_containerWithMostWater;

/*
Find two lines that together with the x-axis form a container, 
such that the container contains the most water.
Return the maximum amount of water a container can store.

Input: height = [1,8,6,2,5,4,8,3,7]
Output: 49
*/

public class Solution {
	public static void main(String[] args) {
		int[] height = new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println(S1.maxArea(height));
	}
}

class S1 {
	public static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int maxArea = 0;

		while (right > left) {
			int h = Math.min(height[right], height[left]);
			int area = h * (right - left);
			maxArea = Math.max(maxArea, area);

			if (height[right] > height[left]) {
				left++;
			} else {
				right--;
			}
		}
		return maxArea;
	}
}

// class S1 {
// public static int maxArea(int[] height) {
// int left = 0;
// int right = height.length - 1;
// int h = 1;
// int area = 1;
// int maxArea = 0;

// while (right > left) {
// if (height[right] > height[left]) {
// h = height[left];
// area = h * (right - left);
// left++;
// } else {
// h = height[right];
// area = h * (right - left);
// right--;
// }
// if (maxArea < area) {
// maxArea = area;
// }
// }
// return maxArea;
// }
// }
package P011_containerWithMostWater;

public class Solution {
    public int maxArea(int[] height) {
    	int left = 0,right=height.length-1,h,w,area,maxArea=0;
    	while(right>left) {
    		System.out.println("left="+left+",right="+right);
    		h=Math.min(height[left], height[right]);
    		w=right-left;
    		area=h*w;
    		if(height[left]>height[right])right--;
    		if(height[left]<=height[right])left++;
    		if (area>maxArea)maxArea=area;
    	}
    	return maxArea;
	}
	
	
	public static void main(String[] args) {
		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		Solution s1=new Solution();
		System.out.print(s1.maxArea(height));
	}
}

package P011_containerWithMostWater;

public class TwoPointers {
    public int maxArea(int[] height) {
    	int min,left,right,distance,maxArea=0,area;
    	for (int i=0;i<height.length;i++) {
    		for(int j=i+1;j<height.length;j++) {
    			left=height[i];
    			right=height[j];
    			min = Math.min(height[i], height[j]);

    			distance=j-i;
    			area=min*distance;
    			if(maxArea<area) {
    				maxArea=area;
    			}
    		}
    	}
    	return maxArea;
	}
	
	
	public static void main(String[] args) {
		int[] height = new int[] {1,8,6,2,5,4,8,3,7};
		TwoPointers s1=new TwoPointers();
		System.out.print(s1.maxArea(height));
	}
}

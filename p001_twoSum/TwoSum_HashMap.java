package p001_twoSum;

import java.util.HashMap;
import java.util.Map;

class Solution_HashMap {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int needed = target - nums[i];
            if(map.containsKey(needed)){
            	//value=map.get(key)
                return new int[]{map.get(needed), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

public class TwoSum_HashMap {

	public static void main(String[] args) {
		Solution_HashMap s1 = new Solution_HashMap();
		int[] nums = new int[] { 2, 7, 11, 15 };
		int target = 9;
		int[] res = s1.twoSum(nums, target);
		for (int i : res) {
			System.out.print(i + " ");
		}
	}

}

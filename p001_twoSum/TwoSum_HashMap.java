package p001_twoSum;

import java.util.HashMap;
import java.util.Map;
/*
给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出 和为目标值 target  的那 两个 整数，并返回它们的数组下标。
你可以假设每种输入只会对应一个答案，并且你不能使用两次相同的元素。
你可以按任意顺序返回答案。
示例 1：
输入：nums = [2,7,11,15], target = 9
输出：[0,1]
解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。

示例 2：
输入：nums = [3,2,4], target = 6
输出：[1,2]

新增或更新
map.put(key, value)

取得value
map.get(key)

檢查 key 是否存在（比對超常用）
map.containsKey(key)
 */

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

class Solution_HashMap {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            //補數
            int needed = target-nums[i];
            // key放值 value=索引
            map.put(nums[i],i);
            //判斷補數 key是否存在
            if (map.containsKey(needed)) {
                //回傳數組(inedx,index)
                return new int[]{map.get(needed),i};
            }
        }
        return null;
    }
}
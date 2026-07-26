package p001_twoSum;

import java.util.ArrayList;
import java.util.List;

public class TwoSum_ArrayList {
    public static void main(String[] args) {
        SolutionArrayList s1 = new SolutionArrayList();
        int[] nums = new int[] { 7, 7, 11, 7, 15 };
        int target = 14;
        int[] res = s1.twoSum(nums, target);
        for (int i : res) {
            System.out.print(i + " ");
        }
    }
}

class SolutionArrayList {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            // 判斷補數是否在list集合中，若true則回傳解答
            int needed = target - nums[i];
            if (list.contains(needed)) {
                return new int[] { list.indexOf(needed), i };
            }
            list.add(nums[i]);
        }
        return null;
    }
}
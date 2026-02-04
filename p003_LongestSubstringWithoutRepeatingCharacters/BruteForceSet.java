package p003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

class BruteForceSet {
    public int lengthOfLongestSubstring(String s) {
    		Set<Character> set;
    		int maxLen=0;
    		//遍歷
    		for (int i=0;i<s.length();i++) {
    			set=new HashSet<>();//set歸0
    			for(int j=i;j<s.length();j++) {
    				if (set.contains(s.charAt(j))) {//如果存在:停止,更新最大值
        				if(maxLen<set.size()) {
        					maxLen=set.size();
        				}
        				break;
        			}else {//不存在:加進集合
        				set.add(s.charAt(j));
        			}
    			}
    		}
    		return maxLen;
    }
    
    public static void main(String[] args) {
		String s = "abcabcbb";
		BruteForceSet s1=new BruteForceSet();
		int res = s1.lengthOfLongestSubstring(s);
		System.out.print(res);
		}
}
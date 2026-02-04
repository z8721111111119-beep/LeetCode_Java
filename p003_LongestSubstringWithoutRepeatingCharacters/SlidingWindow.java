package p003_LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Set;

class SlidingWindow {
    public int lengthOfLongestSubstring(String s) {
    		Set<Character> set = new HashSet<>();
    		int maxLen=0;
    		int left=0,right=0;
    		
    		while(right<s.length()){
    			
    			//不重複 右指針向右
    			if(!set.contains(s.charAt(right))) {
    				set.add(s.charAt(right));
        			right++;
        			//更新最大長度
        			if(maxLen<set.size()) {
        				maxLen=set.size();
        			}
        			
        		//重複 左指針向右
    			}else {
    				set.remove(s.charAt(left));
    				left++;
    			}	
    			
    		}	
    		return maxLen;
    }
    
    public static void main(String[] args) {
		String s = "abcabcbb";
		SlidingWindow s1=new SlidingWindow();
		int res = s1.lengthOfLongestSubstring(s);
		System.out.print(res);
		}
}
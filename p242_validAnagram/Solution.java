package p242_validAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

class Solution {
    public boolean isAnagram(String s, String t) {
        Map<Character,Integer> mapS=stringToMap(s);
        Map<Character,Integer> mapT=stringToMap(t);
        return equalsMap(mapS,mapT);
    }

    public Map<Character,Integer> stringToMap(String s) {
		Map<Character,Integer> map=new HashMap<>();

		int frequency;
		//將s遍歷 加進map
		for(int i=0;i<s.length();i++) {
			if(!map.containsKey(s.charAt(i))) {
				map.put(s.charAt(i), 1);
			}else {
				frequency=map.get(s.charAt(i))+1;
				map.put(s.charAt(i), frequency);
			}
		}
		return map;
	}
		
	public boolean equalsMap(Map<Character,Integer> map1,Map<Character,Integer> map2) {
		//比大小
		if (map1.size() !=map2.size()) {
			return false;
		}
		for(Entry<Character,Integer> entry:map1.entrySet()) {
			char map1Key=entry.getKey();
			int map1Value=entry.getValue();
			//比key
			if (!map2.containsKey(map1Key)) {
				return false;
			}
			//比value
			if (map2.get(map1Key) != map1Value ) {
				return false;
			}
		}
		return true;
	}
}
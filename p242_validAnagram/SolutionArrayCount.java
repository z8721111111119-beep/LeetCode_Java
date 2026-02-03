package p242_validAnagram;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SolutionArrayCount {
    public boolean isAnagram(String s, String t) {
    	//比較大小
    	if (s.length() != t.length()) return false;
    	
    	int[] array=new int[26];//存放字母數量 index0為'a' index1為'b'
    	for (int i=0;i<s.length();i++) {	
    		array[s.charAt(i)-'a']++;//s字串的字母+1
    		array[t.charAt(i)-'a']--;//t字串的字母-1
    	}
    	for (int check:array) {
    		if (check != 0)return false;
    	}
    	return true;
    }
}   
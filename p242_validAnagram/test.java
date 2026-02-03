package p242_validAnagram;

public class test {

	public static void main(String[] args) {
		String s = "anagram", t = "nagaram";
		
		SolutionHashMap s1=new SolutionHashMap();
		boolean res=s1.isAnagram(s, t);
		System.out.print("SolutionHashMap output:"+res);
		System.out.println();
		SolutionArrayCount s2=new SolutionArrayCount();
		res=s2.isAnagram(s, t);
		System.out.print("SolutionArrayCount output:"+res);
		
	}
}

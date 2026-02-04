package p344_reverseString;



public class SolutionSwap {
	public void reverseString(char[] s) {
		int left=0,right=s.length-1;//指標起點位置(索引)
		while(right>left){
			char temp=s[left];
			s[left]=s[right];
			s[right]=temp;
			left++;
			right--;
		}
	}
	
	public static void main(String[] args) {
		char[] s=new char[] {'a','b','c','d','e','f'};
		SolutionSwap s1=new SolutionSwap();
		s1.reverseString(s);
		for (char i:s) {
			System.out.print(i);
		}

	}

}

package p283_moveZeroes;

public class test {

	public static void main(String[] args) {
		int[] array=new int[] {0,1,0,3,12};
		BurteForce s1=new BurteForce();
		int[] res = s1.moveZeroes(array);
		System.out.print("BurteForce:");
		for (int i:res) {
			System.out.print(i+" ");
		}
		System.out.println();
		Optimized s2=new Optimized();
		res=s2.moveZeroes(array);
		System.out.print("Optimized:");
		for (int i:res) {
			System.out.print(i+" ");
		}
	}

}

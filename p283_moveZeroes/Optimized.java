package p283_moveZeroes;

public class Optimized {
	//swap
	public int[] moveZeroes(int[] array) {
		int index=0;//放非0的位置
		
		for(int i=0;i<array.length;i++) {
			if(array[i] !=0) {
				array[index]=array[i];
				index++;
			}
		}
		return array;
	}
}

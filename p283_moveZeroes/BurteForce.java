package p283_moveZeroes;

public class BurteForce {

	public int[] moveZeroes(int[] array) {
				
		int index=0;//放非0數字的位置
		//將非0數字移置前面
		for(int i=0;i<array.length;i++) {
			if(array[i]!=0) {
				array[index]=array[i];
				index++;
			}
		}
		for (int i=index;i<array.length;i++) {
			array[i]=0;
		}
		return array;
	}
}


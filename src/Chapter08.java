
public class Chapter08 {

	public static void main(String[] args) {
		// 1while文
		int number = 1;
		while (number < 5) {	
			//べき乗
			System.out.println(number*number);
			number ++;
		}
		
		// 2for文
		int[] array = {1,4,14,25};
		for (int i = 0; i < array.length; i++ ) {
			System.out.println(array[i]);
		}
	
		// 3拡張for文 偶数はスキップ
		for(int j:array) {
			if (j % 2 == 0) {
				continue;
			}
			System.out.println(j);
		}
		
		
	
	}

}

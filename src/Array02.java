
public class Array02 {

	public static void main(String[] args) {
		// 配列の拡張for文　　偶数の和、奇数の和
		//奇数の和
		int oddSum = 0;
		//偶数の和
		int evenSum = 0;
//		
//		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
//		
//		for (int i:numbers) {
//			if (i %2 == 0) {
//				evenSum = evenSum + i;
//		    } else {
//		    	oddSum += i;
//		    }
//		}
//
		//配列のfor文
		int[] numbers = {1,2,3};
		//iはインデックス番号、要素数
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] % 2 == 0) {
				evenSum += evenSum + numbers[i];				
			} else {
				oddSum += numbers[i];
			}
		}
		

//		//配列なし通常のfor文		
//		for (int i = 1; i <= 10; i++ ) {
//			if (i % 2 == 0) {
//				evenSum += i;
//			} else {
//				oddSum += i;
//			}
//		}
		System.out.println("奇数の和は" + oddSum);
	    System.out.println("偶数の和は" + evenSum);
		
		
	}

}


public class Array02 {

	public static void main(String[] args) {
		// 偶数の和、奇数の和
		//奇数の和
		int oddSum = 0;
		//偶数の和
		int evenSum = 0;
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		for (int i:numbers) {
			if (i %2 == 0) {
				evenSum = evenSum + i;
		    } else {
		    	oddSum += i;
		    }
		}

		    System.out.println("奇数の和は" + oddSum);
		    System.out.println("偶数の和は" + evenSum);
	}

}

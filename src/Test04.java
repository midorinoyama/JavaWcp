
public class Test04 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int[] array = new int[10];
		boolean bool = true;
		
		//配列は5の倍数
		for (int i = 0; i < array.length; i++) {
			array[i] = i*5;
		}
		
		for (int i = 0; i < array.length; i++) {		
			if (i <= 10) {
				if ( i %2 != 0) {
					if(bool) {
						System.out.print(array[i]);
						bool = false;
					} else {
						System.out.print("," + array[i]);
					}
				}
					
			}
		}

		for (int i = 0; i < array.length; i++) {		
			if (i >= 11) {
				if (i <= 19) {
					if ( i %2 == 0) {
						System.out.print("," + array[i]);
//						if(bool) {
//							System.out.print(array[i]);
//							bool = false;
//						} else {
//							System.out.print("," + array[i]);
//						}
					}
				}									
			}
		}
	}

}

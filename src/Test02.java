
public class Test02 {

	public static void main(String[] args) {
		// 1~10 偶数が〇個、偶数の合計値が〇を表示
		
		int amount = 0;
		int sum = 0;
		
		for (int i=1; i<=10; i++) {
			if (i%2 == 0) {
				amount = i;
				sum += i;
			}
		}
		//最初はfor分の中に入れて考えていたから注意
		System.out.println("偶数は" + amount + "個です");
		System.out.println("偶数の合計値は" + sum);
	}

}

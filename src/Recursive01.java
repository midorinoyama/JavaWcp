
public class Recursive01 {
	public static void main(String[] args) {
		//再起処理、再起呼び出し
		int number = 1;
		printNum(number);
	}
	
	public static int printNum(int number) {
		if (number < 50) {
			number *= 2;
			System.out.println(number);
			//条件にマッチしたら再度呼び出す
			printNum(number);
		}
		return number;
	}
	

}

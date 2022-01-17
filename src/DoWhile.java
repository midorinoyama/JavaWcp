
public class DoWhile {
	public static void main(String[] args) {
		//do-while文 条件がtrueの間繰り返す
		// while文との違いは条件式をブロックの実行前に評価するか後にするか
		//前にすると実行せず、後にすると実行される場合がある
		
		int number = 100;
		do {
			number*=2;
			System.out.println("DoWhile01=" + number);
		} while (number < 50);
	}

}


public class Test03 {

	public static void main(String[] args) {
		// 1,2,3,---------9,10 最期はカンマを付けない
		for (int i = 1; i < 11; i++) {
			if (i < 10) {
				System.out.print(i + ",");
			} else {
				System.out.print(i);
			}
		}

	}

}

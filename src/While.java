
public class While {
	public static void main (String[] args) {
		//while文は条件がtrueの間繰り返す、falseだった場合に終了する 
		int number = 100;
		while (number < 50) {
			number*=2;
			System.out.println("number =" + number);
		}
	}
}


public class Switch {

	public static void main(String[] args) {
		int n = 3;
		//caseの後ろはコロン
		
		switch (n) {
		case 1:
			System.out.println("大吉です");
			break;
		case 2:
			System.out.println("吉です");
			break;
		default :
			System.out.println("凶です");
			break;
		}

	}

}

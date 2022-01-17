
public class Continue01 {
	public static void main(String[] args) {
		for (int i = 0; i < 5; i++) {
			if (i == 2 ) {
				//iが2の場合、処理をスキップする
				continue;
			}
			//位置for下じゃない？
			System.out.println(i);	
		}
	}

}

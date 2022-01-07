
public class Style {

	public static void main(String[] args) {
		//プリミティブ型、数値や文字のデータをそのものを保持
		
		// 大きい整数はlong型、最期にL
		long long1 = 9223372036854775807L;
		System.out.println(long1);

		// 少数は2種類、floatは最期にf
		double double1 = 12.345;
		float float1 = 0.0123f;
		System.out.println(double1);
		System.out.println(float1);
		
		// 論理型 真か偽ダブルクォートは付けない	
		boolean bool = true;
		boolean bool2 = false;
		System.out.println(bool);
		System.out.println(bool2);
		
		// 文字型はchar型のみ、i文字しか格納できない、
		// シングルクォートで囲む！！
		char char1 = 'あ';
		char char2 = 'a';
		// char char3 = 'ab'; エラー
		
		System.out.println(char1);
		System.out.println(char2);
		//System.out.println(char3);
		
	}

}

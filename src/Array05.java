
public class Array05 {
	public static void main(String[] args) {
		//配列a、配列bの各要素の合計を配列cに代入する
		
		int[] a = {1,2,3,4,5};
		int[] b = {6,7,8,9,10};
		int[] c = new int[5];
		
		for (int i = 0; i < c.length; i++) {
			c[i] = a[i] + b[i];
			System.out.println(c[i]);
		}
	}

}
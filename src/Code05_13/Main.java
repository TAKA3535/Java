package Code05_13;
//同じ配列を参照していることを確認　P212
public class Main {
//	int型配列を受け取り、配列内の要素すべてに1を加えるメソッド
	public static void intArray(int[] array) {
		for (int i = 0; i < array.length; i++) {
			array[i]++;
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
		intArray(array);
//		arrayの全要素を出力
		for (int i : array) {
			System.out.println(i);
		}	
	}
}

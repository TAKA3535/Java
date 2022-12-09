package Code05_14;
	//戻り値が配列の場合 P213
public class Main {
//	int型配列を作成して戻すメソッド		9
	public static int[] makeArray(int size) {
//								 9
		int[] newArray = new int[size];
		for (int i = 0; i < newArray.length; i++) {
			newArray[i] = i;
		}
//	配列を戻す	アドレス
		return newArray;
	}
	
	public static void main(String[] args) {
//						アドレス
		int[] array = makeArray(9);
//		arrayの全要素を出力
		for (int i : array) {
			System.out.println(i);
		}
	}
}

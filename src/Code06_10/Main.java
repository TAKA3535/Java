package Code06_10;
	//API利用の例 P257
public class Main {

	public static void main(String[] args) {
		int[] heights = {172, 149, 152, 191, 155};
//		java.utilのパッケージが裏にあってArraysクラスのsort(heights)関数を呼び出している
		java.util.Arrays.sort(heights);
		for (int h : heights) {
//	Systemクラス、java.langパッケージに属す
			System.out.println(h);
		};
	}
}

//JavaAPIに含まれる代表的なパッケージ P258
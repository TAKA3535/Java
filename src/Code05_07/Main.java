package Code05_07;

public class Main {
	//戻り値の例 202
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}
//		↑↓どっちが先でも大丈夫だった
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
	}

}

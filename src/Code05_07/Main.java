package Code05_07;

public class Main {
	//戻り値の例 202
	public static int add(int x, int y) {
		int ans = x + y;
//			↑↓変数はanswerとかでもいい、個の変数はadd関数内のみ有効
//		厳密にいうとansが戻っているのではなく中のx + yの計算のされた後の値(今回だと110)が戻っている
		return ans;
	}
//		↑↓どっちが先でも大丈夫だった
	public static void main(String[] args) {
		int ans = add(100, 10);
		System.out.println("100 + 10 = " + ans);
	}

}

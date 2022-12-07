package Code05_08;

public class Main {
	//戻り値をそのまま使う 203
	public static int add(int x, int y) {
		int ans = x + y;
		return ans;
	}

	public static void main(String[] args) {
		//内側の2つのaddメソッド計算後、外側のaddメソッドで計算		
		System.out.println("合計" + add(add(10, 20), add(30, 40)));
	}
}
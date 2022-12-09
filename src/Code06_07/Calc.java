package Code06_07;

public class Calc {
//	別のパッケージにあるクラスを呼び出す
	public static void main(String[] args) {
		int a = 10; int b = 2;
//					パッケージ名+クラス名　P237
		int total = Code06_04.CalcLogic.tasu(a, b);
		int delta = Code06_04.CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);

	}
}


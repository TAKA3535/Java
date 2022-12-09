package Code06_04;

public class Calc {

	public static void main(String[] args) {
		int a = 10; int b = 2;
//		同じパッケージ内(Code06_04のCalcLogicクラスを呼び出し)
		int total = CalcLogic.tasu(a, b);
		int delta = CalcLogic.hiku(a, b);
		System.out.println("足すと" + total + "、引くと" + delta);
	}
}
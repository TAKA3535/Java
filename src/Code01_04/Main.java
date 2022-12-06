package Code01_04;

public class Main {

	public static void main(String[] args) {
//		変数宣言にfinalを記述するとプログラムの動作中に変数の値が書き換えが防止になる
		final double PI =3.14;
		int pie = 5;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
		System.out.println("パイの半径を倍にします");
//		PI = 10をしようとするとコンソール画面でエラーになる、final変数PIに値を代入することはできません
		pie = 10;
		System.out.println("半径" + pie + "cmのパイの面積は、");
		System.out.println(pie * pie * PI);
	}
}

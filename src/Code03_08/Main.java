package Code03_08;

public class Main {

	public static void main(String[] args) {
//		for文の中の変数iの動き
		for (int i = 0; i < 10; i++) {
			System.out.println("現在" + (i + 1) + "周目→");
		}
	}

}

//ループ変数を１からスタート
//	for (int i = 0; i < 10; i++) {

//ループ変数を2ずつ増やす
//for (int i = 0; i < 10; i += 2) {

//ループ変数を１0から1ずつ1まで減らしていく
//for (int i = 10; i > 0; i--) {

//ループ変数を初期化しない
//for (; i < 10; i++) {

//繰り返し時の処理を行わない
//for (int i = 0; i < 10;) {
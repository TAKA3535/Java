package Code08_all;
//P325　、「設計図用クラス」
public class Matango {	//メンバメソッド①
	int hp;
//	フィールドを定数として宣言
	final int LEVEL = 10;	//フィールドEVELは10で固定、finalで固定する場合変数名は基本大文字で書く
	char suffix;
	public void run() {	//メンバメソッド②
		System.out.println("お化けキノコ" + this.suffix + "は逃げ出した！");
		System.out.println("お化けキノコのHPは" + this.hp);
	}
}

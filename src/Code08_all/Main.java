package Code08_all;
//仮想世界に勇者を生み出すプログラム,「実行用クラス」
public class Main {

	public static void main(String[] args) {
		// 1.勇者(インスタンス)を生成、「クラス名 変数名 = new クラス名();」
		Hero h = new Hero();
		//2.フィールドに初期値をセット、フィールドへの値を代入「変数名.フィールド名 = 値;」
		h.name = "ミナト";	//変数hのnameに代入
		h.hp = 100;			//変数hのhpに代入
		
		Matango m1 = new Matango();	//お化けキノコ(1匹目を生成し初期化)
		m1.hp = 50;
		m1.suffix = 'A';
		
		Matango m2 = new Matango();	//お化けキノコ(2匹目を生成し初期化)
		m2.hp = 48;
		m2.suffix = 'B';
		
		System.out.println("勇者" + h.name + "を生み出しました！");	//変数hのnameを取り出す
		//3.勇者のメソッドを呼び出してゆく
		h.sit(5);	//5秒座れ
		h.slip();	//転べ
		h.sit(25);	//25秒座れ
		h.run();	//逃げろ
		h.sleep();
		m1.run();
		m2.run();
	}
}

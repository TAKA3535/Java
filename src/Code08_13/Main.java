package Code08_13;
//仮想世界に勇者を生み出すプログラム
public class Main {

	public static void main(String[] args) {
		// 1.勇者を生成
		Hero h = new Hero();
		//2.フィールドに初期値をセット
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
	}
}

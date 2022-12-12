package Code09_05_06;	//P345

public class Main {

	public static void main(String[] args) {
		Hero h1 = new Hero();
		h1.name = "モリタ";
		h1.hp = 100;
		Hero h2 = new Hero();
		h2.name = "カヒロ";
		h2.hp =	150;
		Wizard w = new Wizard();
		w.name = "森田";
		w.hp = 50;
//		Helo型の変数h1,h2を渡す
		w.heal(h1);	//モリタを回復させる
		System.out.println(h1.hp);
		w.heal(h2);	//カヒロを回復させる
		System.out.println(h2.hp);
		w.heal(h2);	//カヒロを回復させる
		System.out.println(h2.hp);
	}
}

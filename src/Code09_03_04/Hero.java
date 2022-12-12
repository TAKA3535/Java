package Code09_03_04;
//	Heroクラスを定義
public class Hero {
	String name;
	int hp;
//	勇者が装備している剣の情報
	Sword sword;
	public void attack(int d) {
		System.out.println(this.name + "は攻撃した!");
		System.out.println("敵に" + d + "ポイントのダメージを与えた");
	}
//	↓はコード9-8、生まれた直後の動作を定義したHeroクラス
	public Hero() {
		this.hp = 100;	//hpフィールドを100で初期化
	}
}

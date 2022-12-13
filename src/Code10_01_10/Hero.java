package Code10_01_10;
//「戦う」と「逃げる」しかできないHeroクラス,親クラス　P370
public class Hero {
	String name = "モリタ";
	int hp = 100;
//	戦う
	public void attack(Matango m) {
		System .out.println(this.name + "の攻撃");
		m.hp -= 5;
		System.out.println(this.name + "は" + m.name + "に5ポイントのダメージをあたえた");
		System.out.println(m.hp);
	}
	public void sit(int sec) {	//座る(sitメソッド)	　int secは何秒座るか引数で受け取る
		this.hp += sec;		//座る秒数だけHPを回復
		System.out.println(this.name + "は、" + sec + "秒座った!");	//this.nameは自分自身のnameフィールド
		System.out.println("HPが" + sec +"ポイント回復した");
	}
	
	public final void slip() {	//転ぶ(slipメソッド),finalつけてるのでSuperHeroではオーバーライドできない
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
//	逃げる
	public void run() {
		System.out.println(this.name + "は逃げたした！");
	}
	public Hero() {	//P389 コンストラクタの動作確認 Code10_10
		System.out.println("Heroのコンストラクタが動作");
	}
}

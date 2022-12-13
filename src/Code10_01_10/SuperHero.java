package Code10_01_10;
//SuperHeroクラスにrun()を再定義する SuperHeroは子クラス、Heroは親クラスになる
public class SuperHero extends Hero{ //Heroクラスを継承、Heroが持ってるattac,run等のメソッドをそのまま使える
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println(this.name + "飛び上がった!");
	}
	public void land() {
		this.flying = false;
		System.out.println(this.name + "着地した");
	}
	public void run() { //Heroクラスのrunに上書きする、オーバーライド379
		System.out.println(this.name + "は撤退した");
	}
//	public void slip() {	←転ぶ(slipメソッド)、Heroクラスでslipメソッドにfinalが記述されているためオーバーライドできない	
	public void slip2() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ! いたい><");
		System.out.println("5のダメージ！");
	}
//	戦う P386 Code10_09 親クラスのattack()を呼び出す
	public void attack(Matango m) { 
//super：今より１つ内側のインスタンス部分を表す予約語
//↑を利用して親インスタンス部分のメソッドやフィールドに子インスタンス部分からアクセスする
		super.attack(m);	//親インスタンス部分のattack()を呼び出し
		if (this.flying) {	//←はthis.flying == trueと同じ、flyメソッド実行してると↓の処理も行う
			super.attack(m);	//親インスタンス部分のattack()を呼び出し
		}
	}
	public SuperHero() {	//P389 コンストラクタの動作確認 Code10_10,このままだと親クラスのHeroの
//		super(); ←本来コンストラクタは戦闘で必ず内部インスタンス部分(親クラス)のコンストラクタを呼び出す必要があり、super();を記述する必要がある、ない場合実行時自動的に挿入される
		System.out.println("SuperHeroのコンストラクタが動作");
	}
}

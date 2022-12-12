package Code08_all;
//P314 メソッド座る、転ぶ、逃げるを追加、「設計図用クラス」
public class Hero {
	String name;	//名前の宣言
	int hp;			//HPの宣言
	public void sleep() {	
		this.hp = 100;	//this.hpは自分自身のHPフィールド
//		thisはつけなくても機能するが、基本つけるようにする、thisは自分自身のインスタンス
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sec) {	//座る(sitメソッド)	　int secは何秒座るか引数で受け取る
		this.hp += sec;		//座る秒数だけHPを回復
		System.out.println(this.name + "は、" + sec + "秒座った!");	//this.nameは自分自身のnameフィールド
		System.out.println("HPが" + sec +"ポイント回復した");
	}
	
	public void slip() {	//転ぶ(slipメソッド)	
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}
	
	public void run() {	//逃げる(runメソッド)
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");		
		System.out.println("最終HPは" + this.hp + "でした");			
	}
}

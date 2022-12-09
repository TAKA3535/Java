package Code08_13;
//P314 メソッド座る、転ぶ、逃げるを追加
public class Hero {
	String name;	//名前の宣言
	int hp;			//HPの宣言
	public void sleep() {	
		this.hp = 100;	//this.hpは自分自身のHPフィールド
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	public void sit(int sec) {	//座る(sitメソッド)	
		this.hp += sec;
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

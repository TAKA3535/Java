package Code09_12_13;

public class Hero {
	String name;
	int hp;

	public Hero(String name) {	//コンストラクタ①
		this.hp = 100;		//hpフィールドを100で初期化
		this.name = name;	//引数の値でnameフィールドを初期化
	}
	
	public Hero() {	//新しく作ったコンストラクタ②
		this.hp = 150;		//hpフィールドを100で初期化
		this.name = "カヒロ";	//←名前設定
	}
}
//コンストラクタ：
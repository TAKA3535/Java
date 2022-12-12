package Code09_10_11;
//Heroクラスを定義
public class Hero {
	String name;
	int hp;

	public Hero(String name) {
		this.hp = 100;		//hpフィールドを100で初期化
		this.name = name;	//引数の値でnameフィールドを初期化
	}
}

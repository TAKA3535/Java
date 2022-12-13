package Code09_03_04;
//剣を装備した勇者を生み出す
public class Main {
	public static void main(String[] args) {
		Sword s = new Sword();
		s.name = "炎の剣";
		s.damage = 10;
		Hero h = new Hero();	//hはメンバ変数
		h.name = "モリタ";
//		h.hp = 100; Heroクラスで初期値設定したので←はなくてOK
		h.sword = s;	//swordフィールドに生成済みの剣インスタンス(の番地)を代入, has aの関係、Hero has a Sword
		System.out.println("モリタの初期HPは" + h.hp);
		System.out.println(h.name + "の現在の武器は" + h.sword.name);	//勇者「の」剣「の」名前
		h.attack(s.damage);
	}
}

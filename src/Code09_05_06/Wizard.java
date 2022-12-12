package Code09_05_06;

public class Wizard {
	String name;
	int hp;
//HeroはHero型、hは仮引数
	public void heal(Hero h) {
		h.hp += 10;	//勇者のHPに10を加える
		System.out.println(h.name + "のHPを10回復した!");
	}
}

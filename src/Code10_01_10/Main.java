package Code10_01_10;
//HeroとSuperHeroのrun()を呼び出す
public class Main {

	public static void main(String[] args) {
		Hero h = new Hero();	//Heroインスタンスを生成、
		Matango mon = new Matango();
		h.attack(mon);
		h.run();
		SuperHero sh = new SuperHero();
		sh.run();
		sh.land();
		sh.sit(10);
		sh.slip();
		sh.slip2();
		sh.fly();
		sh.attack(mon);
	//Code10_11
		Weapon w = new Weapon();
	}
}

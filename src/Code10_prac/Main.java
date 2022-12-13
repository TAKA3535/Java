package Code10_prac;
//HeroとSuperHeroのrun()を呼び出す
public class Main {

	public static void main(String[] args) {
		PoisonMatango pm = new PoisonMatango('A');
		Hero h = new Hero();	//Heroインスタンスを生成、
		pm.attack(h);
		System.out.println("勇者のHP:" + h.hp);
	
	}
}

package Code09_02;
//２つのHero型変数を利用 P339,340
public class Main {

	public static void main(String[] args) {
		Hero h1;
		h1 = new Hero();
		h1.hp = 100;
		Hero h2;
		h2 = h1;	//h1のアドレスをh2に代入、中のアドレスが同じになる、つまりアドレスをコピーしている
		h2.hp = 200;	//h1も200になる
		System.out.println(h1.hp);
	}
}

package Code09_12_13;
//	コンストラクタをオーバーロードしたクラスの利用
public class Main {
	public static void main(String[] args) {
//インスタンス生成後、JVMがコンストラクタを呼び出す際に「モリタ」を渡してもらえる
		Hero h1 = new Hero("モリタ");
		
		System.out.println("初期HPは" + h1.hp);
		System.out.println("名前：" + h1.name);
		
		Hero h2 = new Hero();	//引数がないのでコンストラクタ②呼び出される
		System.out.println("初期HPは" + h2.hp);
		System.out.println("名前：" + h2.name);
	}
}

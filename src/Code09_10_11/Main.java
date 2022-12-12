package Code09_10_11; //P356 newで引数を渡す
//剣を装備した勇者を生み出す
public class Main {
	public static void main(String[] args) {
//インスタンス生成後、JVMがコンストラクタを呼び出す際に「モリタ」を渡してもらえる
		Hero h = new Hero("モリタ");
		
		System.out.println("モリタの初期HPは" + h.hp);
		System.out.println("名前：" + h.name);
	}
}

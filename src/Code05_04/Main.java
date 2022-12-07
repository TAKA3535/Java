package Code05_04;

public class Main {
	//引数
	public static void main(String[] args) {
		System.out.println("メソッドを呼び出しています");
		//()の中の値を渡している		
		hello("もり");
		hello("たか");
		hello("ひろ");
		System.out.println("メソッド呼び出し終了");
	}
	
	public static void hello(String name) {
		System.out.println(name + "さん、やっほー");
	}
}

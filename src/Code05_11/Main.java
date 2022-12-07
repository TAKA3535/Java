package Code05_11;

public class Main {
	//オーバーロード(引数の数が異なる場合)
	public static int add(int x, int y) {
		return x + y;
	}
	
	public static int add(int x, int y, int z) {
		return x + y + z;
	}
	
	public static void main(String[] args) {
//		1つのメソッドを呼び出す
		System.out.println("10+20=" + add(10, 20));
//		２つ目のメソッドを呼び出す
		System.out.println("10+20+30=" + add(10, 20, 30));
	}
}
//通常メソッドに同じ名前を付けれないが、このように仮引数が異なれば同じ名前のメソッドを複数定義することが可能
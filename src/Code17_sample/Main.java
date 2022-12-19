package Code17_sample;
public class Main {
//17章 例外処理の例
	public static void main(String[] args) {
		try {
			int a = 100 ;
			int b = 0 ;
//			int b = Integer.parseInt("ZZZ") ;

			System.out.println("計算開始");
			System.out.println(a + "÷" + b + "＝" + (a / b));
			System.out.println(a + "÷" + b + "のあまりは" + (a % b));
			System.out.println("計算が無事終了\n");
					
		} catch (ArithmeticException e) {
			System.out.println("0で割らないでください\n");
			System.out.println("↓詳細（e.getMessage()メソッド）\n" + e.getMessage() + "\n");
			System.out.println("↓ログ（e.printStackTrace()メソッド）");
			e.printStackTrace();
			
		} catch (Exception e) {
			System.out.println("なんらかの例外が発生しました\n");
			System.out.println("↓詳細（e.getMessage()メソッド）\n" + e.getMessage() + "\n");
			System.out.println("↓ログ（e.printStackTrace()メソッド）");
			e.printStackTrace();

		} finally {
			System.out.println("\nプログラムを終了します。");
		}
	}
}

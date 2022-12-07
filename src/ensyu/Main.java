package ensyu;
//	算術演算子＋関係演算子
//public class Main {
//	public static void main(String[] args) {
//		System.out.println("加算　：" + (9 + 2));
//		System.out.println("減算　：" + (9 - 2));
//		System.out.println("乗算　：" + (9 * 2));
//		System.out.println("除算　：" + (9 / 2));
//		System.out.println("剰余算：" + (9 % 2));
//
//		System.out.print("\n");
//
//		System.out.println("同じか：" + (9 == 2));
//		System.out.println("違うか：" + (9 != 2));
//	}
//}
//	P.130 繰返しを使ったコード3-8の応用
public class Main {
	  public static void main(String[] args) {
//⓪通常パターン
		  for (int i = 0; i < 3; i++) {
			  System.out.print("現在" + (i + 1) + "周目→");
		  }
		  System.out.println("");
		  
//①ループ変数を１からスタート
		  for (int i = 1; i <= 3; i++) {
			  System.out.print("現在" + (i) + "周目→");
		  }
		  System.out.println("");
		  
//②増分が2ずつ
		  for (int i = 0; i < 6; i += 2) {
			  System.out.print("現在" + (i / 2 + 1) + "周目→");
		  }
		  System.out.println("");
		  
//③ループ変数を3から減らしていく		  
		  for (int i = 3; i > 0; i--) {
			  System.out.print("現在" + (4 - i) + "周目→");
		  }
		  System.out.println("");
		  
//④カウンタを外で初期化する
	      int i = 0;
	      for (; i < 3; i++) {
	    	  System.out.print("現在" + (i + 1) + "周目→");
	      }
	      System.out.println("");
	      
//⑤増分をループ内で行う
		  for (int j = 0; j < 3;) {
			  System.out.print("現在" + (j + 1) + "周目→");
			  j++;
		  }
		  System.out.println("");
	  }
}

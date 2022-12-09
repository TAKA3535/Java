package Code05_05;

public class Main {
	//引数が複数ある場合P195
	public static void main(String[] args) {  				 //呼び出す側
//		↓add()の中は実引数
		add(100, 20);
		add(200, 50);
	}
//	複数の値を受け取るaddメソッド,↓のadd()の中は仮引数
	public static void add(int x, int y) {					//呼び出される側
		int ans = x + y;		
		System.out.println(x + "+" + y + "=" + ans  );
	}

}

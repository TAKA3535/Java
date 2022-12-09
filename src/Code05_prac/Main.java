package Code05_prac;

// 	P218 練習１ 
//public class Main {
//	
//	public static void introduceOneself() {
//		String name = "森 雄大";
//		int age = 29;
//		double height = 169.5;
//		char eto = '牛';
//		
//		System.out.println("名前：" + name);
//		System.out.println("年齢：" + age);
//		System.out.println("身長：" + height);
//		System.out.println("干支：" + eto);
//		
//	}
//	
//	public static void main(String[] args) {
//		introduceOneself();
//	}
//}
		//練習２
//public class Main {
//	
//	public static void email(String title, String ad, String tex) {
//		System.out.println(ad + "に、以下のメールを送信しました。");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + tex);
//	}
//	
//	public static void main(String[] args) {
//		String title = "やっほー";
//		String address = "asdf1234@gmail.com";
//		String text = "飯食べに行かね？";
//		
//		email(title, address, text);
//	}
//}
		//練習３
//public class Main {
//	
//	public static void email( String ad, String tex) {
//		System.out.println(ad + "に、以下のメールを送信しました。");
//		System.out.println("件名： 無題");
//		System.out.println("本文：" + tex);
//	}
//	
//	public static void email(String title, String ad, String tex) {
//		System.out.println(ad + "に、以下のメールを送信しました。");
//		System.out.println("件名：" + title);
//		System.out.println("本文：" + tex);
//	}
//	
//	public static void main(String[] args) {
//		String address = "asdf1234@gmail.com";
//		String text = "飯食べに行かね？";
//		
//		email( address, text);
//	}
//}
	//練習４
public class Main {

	public static double calcTriangleArea(double b, double h) {
		double ans = b * h / 2;
		return ans;
	}

	public static double calcCircleArea(double r) {
		double answer = r * r * 3.14;
		return answer;
	}

	public static void main(String[] args) {
//		double bottom = 9.0;
//		double height = 5.0;
//		double ans1;
//		ans1 = calcTriangleArea(bottom, height);
//		double ans1 = calcTriangleArea(9.0, 5.0);   	//↑4行を←の1行の書き方でもOK
//	
//		System.out.println("三角形の面積は" + ans1 + "㎠");
		System.out.println("三角形の面積は" + calcTriangleArea(9.0, 5.0) + "㎠"); 	//←80～82行をさらに1文で書いたもの
		
//		double radius = 5.0;
//		double ans2 = calcCircleArea(radius);
//		double ans2 = calcCircleArea(5.0);   //↑2行を←の1行の書き方でもOK
//		
//		System.out.println("円の面積は" + ans2 + "㎠");
		System.out.println("円の面積は" + calcCircleArea(5.0) + "㎠");		//←87～89行をさらに1文で書いたもの
		
	}
}


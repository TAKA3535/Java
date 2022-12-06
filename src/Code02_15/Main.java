package Code02_15;

public class Main {

	public static void main(String[] args) {
//	キーボードから入力を受け付ける命令
		System.out.println("あなたの名前を入力してください");
//		キーボードから１行の文字列の入力を受け付ける
		String name = new java.util.Scanner(System.in).nextLine();
		System.out.println("あなたの年齢を入力してください");
//		キーボードから１つの整数の入力を受け付ける
		int age = new java.util.Scanner(System.in).nextInt();
		System.out.println("ようこそ、" + age + "歳の" + name + "さん");
	}

}

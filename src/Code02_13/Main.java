package Code02_13;

public class Main {

	public static void main(String[] args) {
//		文字列を数値に変換する命令 P90
		String age = "29";
//		String型をint型に変換
		int n = Integer.parseInt(age);
		System.out.println("あなたは来年、" + (n + 1) + "年になりますね。");
	}

}

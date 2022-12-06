package Code02_14;

public class Main {

	public static void main(String[] args) {
//	ランダムな数を生成する命令,↓のだとrは0～29
		int r = new java.util.Random().nextInt(30);
		System.out.println("あなたは、" + r + "歳ですか？");
	}

}

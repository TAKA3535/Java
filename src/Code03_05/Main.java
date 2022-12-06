package Code03_05;

public class Main {

	public static void main(String[] args) {
		// switch文の分岐、if文でも同じ結果を出せるがswitch文の方がスマート
		System.out.println("あなたの運勢を占います。");
		int fortune = new java.util.Random().nextInt(4) + 1;
		System.out.println("あなたの運勢を占います。");
		switch(fortune) {
		case 1:
			System.out.println("大吉");
			break;
		case 2:
			System.out.println("中吉");
			break;
		case 3:
			System.out.println("吉");
			break;
		case 4:
			System.out.println("凶");
			break;
		}
	}
}

package Code05_03;

public class Main {

	public static void methodA() {
		System.out.println("methodA");
//		methodAでmethodBを呼び出している↓
		methodB();
	}

	public static void methodB() {
		System.out.println("methodB");
	}

	public static void main(String[] args) {
	methodA();
	}
}


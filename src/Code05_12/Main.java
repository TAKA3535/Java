package Code05_12;

public class Main {
	//引数に配列を用いる          ↓引数に配列型を指定
	public static void printArray(int[] array) {
		for (int element : array) {
			System.out.println(element);
		}
	}
	
	public static void main(String[] args) {
		int[] array = {1, 2, 3, 4};
//		↓配列を渡す、配列丸ごとではなく、アドレス情報のみを引数として渡している
		printArray(array);
	}
}

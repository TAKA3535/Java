package Code04_10;

public class Main {
	//P158 code04_01を配列化	
	public static void main(String[] args) {
		int [] scores = {20, 30, 40, 50, 80};
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		int avg = sum / scores.length;
		System.out.println("合計点：" +  sum);
		System.out.println("合計点：" +  avg);
	}
}

package Code04_01;

public class Main {
		//　P144
	public static void main(String[] args) {
		int sansu =20;
		int kokugo = 30;
		int rika = 40;
		int eigo = 50;
		int syakai = 80;
		
		int sum = sansu + kokugo + rika + syakai + eigo;
		
		int avg = sum / 5;
		System.out.println("合計点：" + sum);
		System.out.println("平均点：" + avg);
	}
}
//↑だとテストの科目が増えるたびに。それをコードに追加しなければならないのとまとめて処理できない
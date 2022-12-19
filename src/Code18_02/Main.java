package Code18_02;
import java.io.*;
//ファイルに1文字ずつ書き込む
public class Main {

	public static void main(String[] args) throws Exception {
		FileWriter fw = new FileWriter("data.txt");
		fw.write('そ');
		fw.write('れ');
		fw.write('で');
		fw.write('は');
		fw.close();
	}
}

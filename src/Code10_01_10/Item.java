package Code10_01_10;
//Code10_11 
public class Item {
	String name;
	int price;
	public  Item(String name) {
		this.name = name;
		this.price = 0;
		System.out.println(this.name + "Itemのコンストラクタが動作");
	}
	public  Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	public  Item() {
		this.name = "森田";
		this.price = 0;
		System.out.println(this.name + "引数なしのItemのコンストラクタが動作");
	}
}

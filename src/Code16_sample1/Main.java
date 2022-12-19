package Code16_sample1;

import java.util.ArrayList;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> points = new ArrayList<Integer>();
    points.add(10);
    points.add(80);
    points.add(75);
    points.add(100);
    
    System.out.println("リストを出力："+points);
    System.out.println("要素数がゼロか："+points.isEmpty());
    
    System.out.println("\n■拡張for文で取り出し↓");
    for (int i : points) {
      System.out.println(points.indexOf(i)+"番目の要素："+i);
    }

    System.out.println("\n■通常のfor文で取り出し↓");
    for (int i=0; i < points.size() ; i++) {
    	System.out.println(i+"番目の要素："+points.get(i));
    }
    
    System.out.println("\n■２番目の要素を「150」に変更↓");
    points.set(2, 150);
    System.out.println(points);
    System.out.println("２番目の要素："+points.get(2));
    System.out.println("要素数："+points.size());
    System.out.println("「100」の場所："+points.indexOf(100));
    
    System.out.println("\n■２番目の要素を削除↓");
    points.remove(2);
    System.out.println(points);
    System.out.println("２番目の要素："+points.get(2));
    System.out.println("要素数："+points.size());
    System.out.println("「100」の場所："+points.indexOf(100));
   
  }
}

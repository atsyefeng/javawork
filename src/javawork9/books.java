package javawork9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
 

public class books {
	String number; 
	String name; 
	double price; 
	String press; 
 
	public books(String number, String name, double price, String press) {
		super();
		this.number = number;
		this.name = name;
		this.price = price;
		this.press = press;
	}
 
	public String toString() {
		return  number +  name +  price + press ;
	}
 
	public static void main(String[] args) {
		books b1 = new books("0001", "《时间简史》", 75, "电子科技出版社");
		books b2 = new books("0002", "《科学百科》", 88, "中央工业出版社");
		books b3 = new books("0003", "《从一到无穷大》", 66, "东方出版社");
		books b4 = new books("0004", "《昆虫记》", 73, "中国铁道出版社");
		books b5 = new books("0005", "《万物简史》", 96, "人民邮电出版社");
		books b6 = new books("0006", "《浪潮之巅》", 77, "中国建筑工业出版社");

		List<books> l = new ArrayList<books>();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		l.add(b6);
		System.out.println("list遍历输出 ：");
		for (books s : l) {
			System.out.println(s);
		}
		System.out.println("map遍历输出：");
		HashMap<String, books> hm = new HashMap<String, books>();
		hm.put(b1.number, b1);
		hm.put(b2.number, b2);
		hm.put(b3.number, b3);
		hm.put(b4.number, b4);
		hm.put(b5.number, b5);
		hm.put(b6.number, b6);
		Set<String> k = hm.keySet();
		for (String s : k) {
			System.out.println(hm.get(s));
		}
	}
}



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
		books b1 = new books("0001", "��ʱ���ʷ��", 75, "���ӿƼ�������");
		books b2 = new books("0002", "����ѧ�ٿơ�", 88, "���빤ҵ������");
		books b3 = new books("0003", "����һ�������", 66, "����������");
		books b4 = new books("0004", "������ǡ�", 73, "�й�����������");
		books b5 = new books("0005", "�������ʷ��", 96, "�����ʵ������");
		books b6 = new books("0006", "���˳�֮�ۡ�", 77, "�й�������ҵ������");

		List<books> l = new ArrayList<books>();
		l.add(b1);
		l.add(b2);
		l.add(b3);
		l.add(b4);
		l.add(b5);
		l.add(b6);
		System.out.println("list������� ��");
		for (books s : l) {
			System.out.println(s);
		}
		System.out.println("map���������");
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



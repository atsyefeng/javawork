package javawork6;

import java.util.Scanner;
import java.util.GregorianCalendar;
public class book_9_5{
	
	public static void main(String[] args){
		GregorianCalendar calendar = new GregorianCalendar();
		System.out.println(calendar.YEAR + ":" + calendar.MONTH + ":" + calendar.DAY_OF_MONTH);
 
		calendar.setTimeInMillis(1234567898765L);
		System.out.println(calendar.YEAR + ":" + calendar.MONTH + ":" + calendar.DAY_OF_MONTH);
	}
}



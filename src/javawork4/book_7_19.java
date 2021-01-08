package javawork4;
import java.util.Scanner;

public class book_7_19 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the size of the list: ");
		
		int number=input.nextInt();
		int[] n=new int[number];
		System.out.print("Enter the contents of the list: ");
		for(int i=0; i<n.length; i++) {
			n[i]=input.nextInt();
		}
		input.close();
		System.out.print("The list has " + number+ " integers " );
		for(int i = 0 ;i<number;i++) {
			System.out.print(" " +n[i]);
		}
		System.out.println("");
		if(isSorted(n))
			System.out.println("The list is already sorted");
		else
			System.out.println("The list is not sorted");
		
	}
	
	public static boolean isSorted(int[] list) {
	
		for(int i=1; i<list.length-1 ; i++) {
			if(list[i-1] > list[i]) {
				return false;
			}
		}
		
		return true;
	}
	
}


package javawork3;
import java.util.Scanner;

public class ISBN {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the first 9 digits of an ISBN as integer: ");
    	
    	int ISBN_9 = input.nextInt();
    	
    	int d9 = ISBN_9 %10;
        int d8 = ISBN_9 /10 % 10;
        int d7 = ISBN_9 /100 % 10;
        int d6 = ISBN_9 /1000 % 10;
        int d5 = ISBN_9 /10000 % 10;
        int d4 = ISBN_9 /100000 % 10;
        int d3 = ISBN_9 /1000000 % 10;
        int d2 = ISBN_9 /10000000 % 10;
        int d1 = ISBN_9 /100000000;

        int d10 = (int)((d1 *1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9)%11);

        if(d1==0 && d10 == 10)
            System.out.println("The ISBN-10 number is 0" +ISBN_9+"X");
        else if(d1==0 && d10 != 10)
            System.out.println("The ISBN-10 number is 0" +ISBN_9+d10);
        else if(d1!=0 && d10 == 10)
            System.out.println("The ISBN-10 number is " +ISBN_9+"X");
        else 
            System.out.println("The ISBN-10 number is " +ISBN_9+d10);


    }
}

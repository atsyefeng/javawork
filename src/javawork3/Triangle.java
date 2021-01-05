package javawork3;
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	System.out.print("Enter the side length of the triangle: ");
    	double s1 = input.nextDouble();
    	double s2 = input.nextDouble();
    	double s3 = input.nextDouble();
    	
    	if(s1+s2>s3 && s1+s3>s2 && s2+s3>s1)
    		System.out.println("The perimeter of the triangle is "+ (s1+s2+s3));
    	else
    		System.out.println("The input value is not valid");
    }
}

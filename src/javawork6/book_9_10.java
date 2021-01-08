package javawork6;

import java.util.Scanner;
public class book_9_10 {
	public static void main(String[] args){
		
		final double EPSILON = 1E-14;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the equation's a");
		double a = input.nextDouble();
		System.out.println("Enter the equation's b");
		double b = input.nextDouble();
		System.out.println("Enter the equation's c");
		double c = input.nextDouble();
		input.close();
		QuadraticEquation equation = new QuadraticEquation(a,b,c);
		
		if(equation.getDiscriminant() > EPSILON){
			System.out.println("root1 is " + equation.getRoot1() + " root2 is " + equation.getRoot2());
		}
		else if(Math.abs(equation.getDiscriminant() - 0) <= EPSILON)
			System.out.println("root is " + equation.getRoot1());
		else
			System.out.println("Ths equation has no roots.");
			
	}
}
class QuadraticEquation {
	private double a,b,c;
	QuadraticEquation(double newA, double newB, double newC){
		a = newA;
		b = newB;
		c = newC;
	}
	public double getA(){
		return a;
	}
	public double getB(){
		return b;
	}
	public double getC(){
		return c;
	}
	public double getDiscriminant(){
		return Math.pow(b, 2) - 4 * a * c;
	}
	public double getRoot1(){
		if(this.getDiscriminant() >= 0)
			return (-b + Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
		else
			return 0;
	}
	public double getRoot2(){
		if(this.getDiscriminant() >= 0)
			return (-b - Math.pow(this.getDiscriminant(), 0.5)) / (2 * a);
		else
			return 0;
	}
}

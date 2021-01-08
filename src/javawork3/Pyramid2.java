package javawork3;
import java.util.Scanner;

public class Pyramid2 {
	 public static void main(String[] args)
	    {
	        for(int i = 1 ; i<=8 ;i++){
	            for(int j= 1; j<=8-i;j++){

	                System.out.print("  ");
	            }

	            for(int j=1;j<Math.pow(2,i);j=j*2){

	                System.out.print(" " + j);
	            }

	            for(double j=(Math.pow(2, i))/4;j>=1;j=j/2){

	                System.out.print(" " +(int)j);
	            }

	               System.out.println();
	        }
	    }
	}
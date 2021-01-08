package javawork4;
import java.util.Scanner;

public class counting {
	public static void main(String[] args){
	    Scanner input = new Scanner(System.in);
	    int[] a = new int[100];
	    int flag = 1;
	    System.out.print("Enter the integers between 1 and 100: ");
	    while(true){
	        flag=input.nextInt();
	        if(flag == 0) break;
	        a[flag] = a[flag] + 1;
	    }
	    for(int i = 0; i < 100; i++){
	        if(a[i] != 0) System.out.println(i + "occurs " + a[i] + " times");
	        }
	    }
	}

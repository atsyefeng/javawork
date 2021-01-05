package javawork3;
import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	
    	System.out.print("Enter the number of lines: ");
    	int n = input.nextInt();
    	 for(int i = 1; i <= n; i++){   
             for(int j = 0; j <= n-i;j++){   
                 System.out.print(" ");
             }
             for(int k = 1; k < i; k++){ 
                 System.out.print(k);
             }
             for(int m = i; m > 0 ; m--){   
                 System.out.print(m);
             }
             System.out.print("\n"); 
         }
         
     }
 }

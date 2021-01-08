package javawork4;
import java.util.Scanner;
public class counting2 {
 
	public static void main(String[] args) {
		int i,j,c=0;
		Scanner input=new Scanner(System.in);
		int[] numbers=new int[10];
		int[] record=new int[10];
		System.out.print("Enter 10 numbers :");
		for(i=0;i<numbers.length;i++)
		{
			numbers[i]=input.nextInt();
		}
		for(i=0;i<numbers.length;i++)
		{
			for(j=i+1;j<record.length;j++)
			{
				if(numbers[i]==numbers[j])
				{
					numbers[j]=0;
				}
			}
		}
		for(i=0,j=0;i<numbers.length;i++)
		{
			if(numbers[i]!=0)
			{
				record[j]=numbers[i];
				j++;
				c++;
			}
		}
		System.out.println("The number of distinct numbers is " + c);
		System.out.print("The distinct numbers are : ");
		for(i=0;i<j;i++)
		{
			System.out.print(" " + record[i]);
		}
	}
 
}
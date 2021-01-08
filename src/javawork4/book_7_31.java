package javawork4;
import java.util.Scanner;

public class book_7_31{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter list1 size and contents :");
		int n=input.nextInt();
		int list1[]=new int[n];
		for(int i=0;i<n;i++) {
			list1[i]=input.nextInt();
		}
		System.out.print("Enter list2 size and contents :");
		int m=input.nextInt();
		int list2[]=new int[m];
		for(int j=0;j<m;j++) {
			list2[j]=input.nextInt();
		}
		
		System.out.print("list1 is :");
		for(int i=0;i<n;i++) {
			System.out.print(" "+ list1[i]);
		}
		System.out.println("");
		System.out.print("list2 is :");
		for(int i=0;i<m;i++) {
			System.out.print(" "+ list2[i]);
		}
		int list3[]=new int[n+m];
		System.arraycopy(list1, 0, list3, 0, n);
		System.arraycopy(list2, 0, list3,n, m);
		int t = 0;
		for(int i=0;i<list3.length;i++) {
            for(int j=i+1;j<list3.length;j++) {
                if(list3[i]>list3[j]) {
                    t = list3[i];
                    list3[i] = list3[j];
                    list3[j] = t;
                }
            }
        }
		System.out.println(" ");
		System.out.print("The merged list is");
		for(int p=0;p<n+m;p++) {
			System.out.print(" "+list3[p] );
		}
	}

}


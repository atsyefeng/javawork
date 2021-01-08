package javawork6;

public class book_9_4 {
	public static void main(String[] args){
		java.util.Random random = new java.util.Random(1000);
		for(int i = 0; i < 50; i++)
			System.out.print(random.nextInt(100) + " ");
		System.out.print("\n");
	}
}


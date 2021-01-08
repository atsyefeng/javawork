package javawork4;
import java.util.Scanner;

public class book_7_34{
    public static void main(String[] args){
        System.out.print("Enter a string:");
        Scanner chs = new Scanner(System.in);
        String str = chs.nextLine();
        str = sort(str);
        System.out.println(str);
    }

    public static String sort(String s){
        char[] str = s.toCharArray();
        java.util.Arrays.sort(str);
        String result = String.valueOf(str);
        return result;
    }
}


package Testjavawork1;

import java.util.Scanner;

public class regexdm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("�������ֻ��ţ�");
        String s = sc.nextLine();

        String regex = "1[38]\\d{9}";//�����ֻ��ù���
        boolean flag = s.matches(regex);//�жϹ���
        System.out.println("flag:"+flag);
    }
}

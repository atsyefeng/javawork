package Testjavawork1;

import java.util.Scanner;

public class regexdm {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入手机号：");
        String s = sc.nextLine();

        String regex = "1[38]\\d{9}";//定义手机好规则
        boolean flag = s.matches(regex);//判断功能
        System.out.println("flag:"+flag);
    }
}

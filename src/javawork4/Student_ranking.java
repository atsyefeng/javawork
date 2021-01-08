package javawork4;

import java.util.Arrays;
import java.util.Scanner;
public class Student_ranking {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("请输入学生个数");
        String strStuNum = reader.nextLine();
        int stuNum = Integer.parseInt(strStuNum);
        String[] sNames = new String[stuNum];
        int[] sScore = new int[stuNum];
        for(int i = 0;i < stuNum; i++){
            System.out.println("请输入第"+(i+1)+"个学生的姓名");
            sNames[i] = reader.nextLine();
            System.out.println("请输入"+sNames[i]+"的分数");
            sScore[i] = Integer.parseInt(reader.nextLine());
   }
        int tempScore;
        String tempName;
        for (int i = stuNum - 1; i > 0; --i) {
            boolean isSort=false;
            for (int j = 0; j < i; ++j) {
               if (sScore[j + 1] < sScore[j]) {
                   tempScore = sScore[j];
                   tempName = sNames[j];
                   sScore[j] = sScore[j + 1];
                   sNames[j] = sNames[j + 1];
                   sScore[j + 1] = tempScore;
                   sNames[j + 1] = tempName;
                   isSort=true;
        }
    }
           if(!isSort)break;
}
       for(int i = stuNum - 1; i >= 0;i--){
            System.out.println("第"+(stuNum - i)+"名\t"+sNames[i]+"\t"+sScore[i]);
   }
  }
}

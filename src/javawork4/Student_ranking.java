package javawork4;

import java.util.Arrays;
import java.util.Scanner;
public class Student_ranking {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("������ѧ������");
        String strStuNum = reader.nextLine();
        int stuNum = Integer.parseInt(strStuNum);
        String[] sNames = new String[stuNum];
        int[] sScore = new int[stuNum];
        for(int i = 0;i < stuNum; i++){
            System.out.println("�������"+(i+1)+"��ѧ��������");
            sNames[i] = reader.nextLine();
            System.out.println("������"+sNames[i]+"�ķ���");
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
            System.out.println("��"+(stuNum - i)+"��\t"+sNames[i]+"\t"+sScore[i]);
   }
  }
}

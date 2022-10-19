package exer;

import java.util.Scanner;
import java.util.Vector;

public class Score {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 可以根据需要动态伸缩数组
        Vector v = new Vector();
        int maxScore = 0;
        while (true) {
            System.out.println("请输入学生成绩，（以负数代表结束）：");
            int score = scan.nextInt();
            if (score < 0) {
                break;
            }
            if (score > 150) {
                System.out.println("输入的数字超出限制，请重新输入");
                continue;
            }

            // 自动装箱
            v.addElement(score);

            if (maxScore < score) {
                maxScore = score;
            }
        }

        // 遍历Vector，得到每个学生的成绩，并与最大成绩比较，得到每个学生的等级
        char level;
        for (int i = 0; i < v.size(); i++) {
            Object obj = v.elementAt(i);
            int score = (int)obj;
            if(maxScore - score <= 10){
                level = 'A';
            }else if(maxScore - score <= 20){
                level = 'B';
            }else if(maxScore - score <= 30){
                level = 'C';
            }else if(maxScore - score <= 40){
                level = 'D';
            }else{
                level = 'E';
            }
            System.out.println("student "+ i + "score is  "+score + ",level is  "+ level);
        }
    }


}

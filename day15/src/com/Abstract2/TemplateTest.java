package com.Abstract2;

public class TemplateTest {
    public static void main(String[] args) {
        Template sub = new SubTemplate();
        sub.spendTime();

    }
}

abstract class Template {
    public void spendTime() {
        long start = System.currentTimeMillis();

        code(); // 不确定，易变的部分

        long end = System.currentTimeMillis();

        System.out.println("代码所用时间为：" + (end - start));
    }

    public abstract void code();
}

class SubTemplate extends Template {

    public void code() {
        for (int i = 2; i <= 100000; i++) {
            boolean isFalg = true;
            for (int j = 2; j < Math.sqrt(i); j++) {
                if (i % j == 0) {
                    isFalg = false;
                    break;
                }
            }
            if (isFalg) {
                System.out.print(i + "\t");
            }
        }
        System.out.println("");
    }
}
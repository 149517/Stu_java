package com.main;

public class MainTest {
    public static void main(String[] args) {

        // 静态能够直接调用静态方法
        Main.main(new String[100]);

    }
}
class Main{
    public static void main(String[] args) {
        for(int i = 0; i< args.length;i++){
            args[i] = "args_"+i;
            System.out.println(args[i]);
        }
    }
}
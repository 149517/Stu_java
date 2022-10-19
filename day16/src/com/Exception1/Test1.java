package com.Exception1;

import java.util.Date;
import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Test1 t1 = new Test1();
        t1.test6();
    }

    // NullPointerException
    public void test() {
        int[] arr = null;
        System.out.println(arr[2]);
    }

    // ArrayIndexOutOfBoundException
    public void test2() {
        int[] arr = new int[10];
        System.out.println(arr[10]);
    }

    // ClassCastException 类型转换异常
    public void test3() {
        Object obj = new Date();
        String str = (String) obj;
    }

    // NumberFormatException    数字格式异常
    public void test4() {
        String str = "123";
        str = "abc";
        int num = Integer.parseInt(str);
    }

    // InputMismatchException   输入不匹配
    public void test5() {
        Scanner scan = new Scanner(System.in);
        int score = scan.nextInt();
    }

    // ArithmeticException   算术异常
    public void test6() {
        int a = 10;
        int b = 0;
        System.out.println(a / b);
    }

    // 编译时异常

    public void test7(){

    }
}

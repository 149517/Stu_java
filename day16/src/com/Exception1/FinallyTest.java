package com.Exception1;

public class FinallyTest {
    public static void main(String[] args) {
        FinallyTest fy = new FinallyTest();
        int a = fy.method();
        System.out.println(a);
    }
    public void test() {
        try {
            int a = 10;
            int b = 0;
            System.out.println(a / b);
        }catch(ArithmeticException e){
            e.printStackTrace();
            int[] arr = new int[10];
            System.out.println(arr[10]);
            // 这里再次出现异常，
        }catch(Exception ee){
            ee.printStackTrace();
        }finally {
            System.out.println("aaaaa");
        }
        System.out.println("bbbbbv");
    }

    public int method(){
        try{
            int[] arr = new int[10];
            System.out.println(arr[10]);
            return 1;
        }catch(ArrayIndexOutOfBoundsException e){
            e.printStackTrace();
            return 2;
        }finally{
            System.out.println("这里一定会被执行");
        }
    }
}

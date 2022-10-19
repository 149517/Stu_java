package com.Exception1;

public class Test2 {
    public static void main(String[] args) {
        Test2 t2 = new Test2();
        t2.test4();
    }
    public void test4() {

        try{
            String str = "123";
            str = "abc";
            int num = Integer.parseInt(str);
        }catch(NumberFormatException e){
            System.out.println("出现数值转换异常了，但不要着急。。。。");
        }


    }
}

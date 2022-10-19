package com.stu;

public class WrapperTest {
    public static void main(String[] args){
        WrapperTest test = new WrapperTest();
        test.test7();
    }
    public void test1(){
        int num1 = 10;
//        System.out.println(num1.toString());
        Integer in1 = new Integer(num1);
        System.out.println(in1.toString());
        Integer in2 = new Integer("1233");
        System.out.println(in2);

        Boolean b1 = new Boolean(true);
        Boolean b2 = new Boolean("TRuE");
        Boolean b3 = new Boolean("true123");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
    }
    public void test2(){
        Integer in1 = new Integer(4322);
        int i1 = in1.intValue();
        System.out.println(i1 + 89);
    }
    public void test3(){
        int num2 = 10;
        Integer in1 = num2;

        boolean b1 = true;
        Boolean b2 = b1;
        System.out.println(in1);
        System.out.println(b2);

        int num3 = in1;
        System.out.println(num3);
    }
    public void test4(){
        int num2 = 101;
        //方式一，连接运算
        String str1 = num2 + "";

        //方式2
        float f1 = 12.3f;
        String str2 = String.valueOf(f1);

        System.out.println(str1);
        System.out.println(str2);

    }
    public void test5(){
        String str1 = "1233";
        int num2 = Integer.parseInt(str1);
        System.out.println(num2 + 23);
    }
    public void test6(){
        Object o1 = true ? new Integer(1) : new Double(2.0);
        System.out.println(o1);
    }
    public void test7(){
        Integer i = new Integer(1);
        Integer j = new Integer(1);
        System.out.println(i == j); //false

        Integer m = 1;
        Integer n = 1;
        System.out.println(m == n);//true

        Integer x = 128;
        Integer y = 128;
        System.out.println(x == y);//false
    }
}

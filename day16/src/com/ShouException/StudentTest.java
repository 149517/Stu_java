package com.ShouException;

public class StudentTest {
    public static void main(String[] args) {
        try {
            Student s1= new Student();
            s1.regist(-12);
            System.out.println(s1);
        } catch (Exception e) {
//            e.printStackTrace();
            System.out.println(e.getMessage());
        }
    }
}
class Student{
    private int id;
    public void regist(int id) throws Exception{
        if(id > 0){
            this.id = id;
        }else{
//            System.out.println("你输入的数据非法");
//            throw new RuntimeException("你输入的数据非法");
            throw new Exception("你输入的数据非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
class Student2{
    private int id;
    public void regist(int id){
        if(id > 0){
            this.id = id;
        }else{
//            System.out.println("你输入的数据非法");
            throw new NegativeException("你输入的数据非法");
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}

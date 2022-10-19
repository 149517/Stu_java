package inheritance3;

public class Student extends Person{
    String major;
    int id = 11111; // 学号
    public Student(){

    }
    public Student(String major){
        this.major = major;
    }

    @Override
    public void eat(){
        System.out.println("多吃一点");
    }
    public void study(){
         System.out.println("好好学习");
    }
    public void show(){
        System.out.println("name =  "+this.name+"age =  "+age);
        System.out.println("ID = "+super.id);
        System.out.println("学号"+this.id);
    }
}

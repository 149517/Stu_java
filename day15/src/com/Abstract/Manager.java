package com.Abstract;

public class Manager extends Employee{
    private double bonus;

    public Manager(double bonus){
        super();
        this.bonus = bonus;
    }
    public Manager(String name,int id,double salary,double bonus){
        super(name,id,salary);
        this.bonus = bonus;
    }

    public Manager() {

    }

    public void work(){
        System.out.println("负责公司的总体走向");
    }
    public void leisure(){
        System.out.println("吹空调");
    }
}

package com.Abstract;

public class CommonEmploy extends Employee{

    public CommonEmploy(String name,int id,double salay){
        super(name,id,salay);
    }

    public void work(){
        System.out.println("员工在一线进行生产");
    }
}

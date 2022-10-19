package com.Abstract;

public class EmployeeTest {
    public static void main(String[] args){
        Employee manager = new Manager("kuke",1111,50000.0,3000);

        Employee em = new Employee() {
            @Override
            public void work() {
                System.out.println("");
            }
        };
        Manager ma = new Manager(){

        };

    }
}



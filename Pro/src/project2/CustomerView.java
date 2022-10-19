package project2;

import java.util.Scanner;

public class CustomerView {
    public static void main(String[] args){
        CustomerView cus = new CustomerView();
        while(cus.enterMainMenu()){

        }

    }
    private CustomerList customers = new CustomerList(10);

    public boolean enterMainMenu(){
        System.out.println("-------------客户信息管理---------");
        System.out.println("\t\t\t1.添加客户");
        System.out.println("\t\t\t2.修改客户");
        System.out.println("\t\t\t3.删除客户");
        System.out.println("\t\t\t4.显示所有客户");
        System.out.println("\t\t\t5.退出");
        System.out.println("请选择1-5：");
        int op = input();
        switch(op){
            case 1:
                addNewCustomer();
                break;
            case 2:
                modifyCustomer();
                break;
            case 3:
                deleteCustomer();
                break;
            case 4:
                listAllCustomers();
                break;
            default:
                System.out.println("是否确认退出（Y/N）");
                boolean exit = input("boolean");
                if(exit){
                    System.out.println("程序退出");
                    return false;
                    //这里的false表示退出，因为这里返回的false将会作用在main函数的循环中
                }
                else {
                    System.out.println("取消退出");
                    return true;
                }
        }
        return true;

    }
    private int input(){
        Scanner scan = new Scanner(System.in);
        int op = scan.nextInt();
        if(op<=0 || op>5){
            System.out.println("输入错误，请重新输入");
            input();
        }
        return op;
    }
    private boolean input(String type){
        Scanner yn = new Scanner(System.in);
        char op = yn.next().charAt(0);
        if(op == 'Y' || op == 'y' ){
            return true;
        }
        else if(op == 'N' || op == 'n'){
            return false;
        }else{
            System.out.println("输入错误，请重新输入");
            input("str");
        }
        return true;
    }
    private int input(int in){
        Scanner scan = new Scanner(System.in);
        int index = scan.nextInt();
        if (index <= 0 || index > customers.getTotal()){
            input(123);
        }
        return index;
    }

    private void addNewCustomer(){
        System.out.println("-------------添加客户---------");
        Scanner add = new Scanner(System.in);
        System.out.println("姓名：");
        String name = add.next();
        System.out.println("性别：");
        char gender = add.next().charAt(0);
        System.out.println("年龄：");
        int age = add.nextInt();
        System.out.println("电话号码：");
        String phone = add.next();
        System.out.println("电子邮箱：");
        String email = add.next();
        Customer cust = new Customer(name,gender,age,phone,email);
        boolean flag = customers.addCustomer(cust);
        if(flag){
            System.out.println("-------------添加完成---------");
        }else{
            System.out.println("-------------添加失败---------");
        }
    }

    private void modifyCustomer(){
        System.out.println("-------------修改客户---------");
        int index = 0;
        Customer cust = null;
        // 修改的用户
        while(true){
            System.out.println("选择修改的用户编号（-1退出）：");
            index = input(123);
            if(index == -1){
                return;
            }
            cust = customers.getCustomer(index - 1);
            if(cust == null){
                System.out.println("找不到指定客户");
            }else{
                break;
            }
        }
        Scanner modify = new Scanner(System.in);

        System.out.println("姓名：（"+cust.getName()+"）：");
        String name = modify.next();
        System.out.println("性别：（"+cust.getGender()+"）：");
        char gender = modify.next().charAt(0);
        System.out.println("年龄：（"+cust.getAge()+"）：");
        int age = modify.nextInt();
        System.out.println("电话号码：（"+cust.getPhone()+"）：");
        String phone = modify.next();
        System.out.println("电子邮箱：（"+cust.getName()+"）：");
        String email = modify.next();

        cust = new Customer(name,gender,age,phone,email);
        boolean flag = customers.replaceCustomer(index-1,cust);
        if (flag) {
            System.out
                    .println("-------------修改完成-------------");
        } else {
            System.out.println("----无法找到指定客户,修改失败----");
        }

    }

    private void deleteCustomer(){
        System.out.println("-------------删除客户-------------");
        int index = 0;
        Customer cust = null;
        // 修改的用户
        while(true){
            System.out.println("选择修改的用户编号（-1退出）：");
            index = input(123);
            if(index == -1){
                return;
            }
            cust = customers.getCustomer(index - 1);
            if(cust == null){
                System.out.println("找不到指定客户");
            }else{
                break;
            }
        }
        System.out.println("是否确认删除？（y/n)");
        boolean yn = input("yn");
        if(yn) {
            System.out.println("确认删除");
            boolean flag = customers.deleteCustomer(index - 1);
            if (flag) {
                System.out
                        .println("---------------------删除完成---------------------");
            } else {
                System.out.println("----------无法找到指定客户,删除失败--------------");
            }
        }else{
            System.out.println("退出删除");
        }

    }

    private void listAllCustomers(){
        System.out.println("-------------显示所有---------");
        Customer[] custs = customers.getAllCustomers();
        if(custs.length == 0){
            System.out.println("没有客户记录");
        }else{
            System.out.println("编号\t姓名\t性别\t年龄\t\t电话\t\t邮箱");
            for(int i = 0;i<custs.length;i++){
                System.out.println(i + 1 + "\t" + custs[i].getName() + "\t" + custs[i].getGender() + "\t" + custs[i].getAge() + "\t\t" + custs[i].getPhone() + "\t" + custs[i].getEmail());
            }
        }
        System.out.println("------------客户列表完成-------");
    }


}

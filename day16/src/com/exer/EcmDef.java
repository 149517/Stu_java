package com.exer;

public class EcmDef {
    public static void main(String[] args) {
        try {
            int i = Integer.parseInt(args[0]);
            int j = Integer.parseInt(args[1]);
            EcmDef ec = new EcmDef();
            System.out.println(ec.ecm(i,j));
        }catch(NumberFormatException e){
            System.out.println("数据类型不一致");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除0");
        } catch (EcDef e) {
            System.out.println(e.getMessage());
        }
    }

    public int ecm(int i,int j) throws EcDef{
        if(i < 0 || j < 0){
            throw new EcDef("数值不能为负数");
        }else{
            return i / j;
        }
    }
}

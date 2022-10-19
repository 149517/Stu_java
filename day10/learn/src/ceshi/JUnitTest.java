package ceshi;


/*
 * 选中当前工程，右键选择：build path -- add libraries  -- Junit4(5) -- next
 * 
 * 创建Java类，进行单元测试
 * 	此时的java类要求，1，这个类是public的，2，此类提供公共的无参的构造器
 * 
 * 此类中声明单元测试的方法
 * 	此时的单元测试方法，方法的权限是public，没有返回值，没有形参
 * 
 * 此单元测试方法上需要声明注解：@Test，并在单元测试类中导入 import org.junit.Test
 * 
 * 声明好单元测试方法后就可以在方法体内测试相关的代码
 * 
 * 写完代码后，左键双击单元测试方法名，右键 run as - Junit Test
 * 
 * 
 * 说明
 * 1，如果执行没有任何异常，绿条
 * 如果出现异常则是红条
 */

public class JUnitTest {
	

	public void test1() {
		String s1 = "mm";
		String s2 = "abc";
		System.out.print(s2);
	}
}

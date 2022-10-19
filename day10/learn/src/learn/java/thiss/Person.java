package learn.java.thiss;
public class Person{
	public static void main(String[] args) {
	
}

}
class Per {
	private String name;
	private int age;
	
	public Per() {
		System.out.println("这个是每一个类都有的内容");
	}
	public Per(String n) {
		this();
		name = n;
	}
	public Per(String n,int a) {
		this(n);
		age = a;
	}
	public void setName(String name) {
		// 形参合属性同名时候
		// 使用this来修饰加以区分。代表的是当前对象
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
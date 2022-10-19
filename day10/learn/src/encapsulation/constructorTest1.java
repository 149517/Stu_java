package encapsulation;

public class constructorTest1 {
	public static void main(String[] args) {
		Per p1 = new Per();
		Per p2 = new Per("Tom",23);
		System.out.println(p2.name);
		System.out.println(p2.age);
		
	}
}

class Per{
	String name;
	int age;
	
	// 构造器
	// 和类重名
	public Per() {
		System.out.println("Person...");
	}
	public Per(int a) {
		age = a;
	}
	public Per(String n,int a) {
		name = n;
		age = a;
	}
	
	// 方法
	public void eat() {
		System.out.print("chifan");
	}
}
package encapsulation;

public class AnimalTest {
	public static void main(String[] args) {
		Animal cat = new Animal();
		cat.name = "mimi";
		cat.age = 3;
//		cat.legs = 5;
		cat.setLegs(3);
		cat.getLegs();
		cat.show();
	}
}
class Animal{
	String name;
	int age;
	// 将legs进行私有
	private int legs;
	// legs 通过调用setLegs才能进行修改，为legs添加其他的修饰条件
	// 提供那个公共的（public）方法来获取（getXXX）和设置（setXXX）此值得属性
	public void setLegs(int l) {
		if(l < 0 | l > 4) {
			System.out.println("输入错误！");
		}else {
			legs = l;
		}
	}
	public int getLegs() {
		
		return legs;
	}
	public void eat() {
		System.out.println("动物进食");
	}
	public void show() {
		System.out.println("name =  "+name+", age =  "+age+",  legs =  "+legs);
	}
}
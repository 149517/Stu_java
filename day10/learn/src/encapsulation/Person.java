package encapsulation;

public class Person {
	
	private int age;
	public void setAge(int a) {
		if(0 <= a & a <= 130) {
			age = a;
		}else {
			throw new RuntimeException("传入的数据非法");
//			System.out.println("传入数据非法");
		}
	}
	public int getAge() {
		
		return age;
	}
}

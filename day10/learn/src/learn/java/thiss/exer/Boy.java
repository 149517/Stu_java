package learn.java.thiss.exer;

public class Boy {
	private String name;
	private int age;
	
	public void setName(String name) {
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
	public void marry(Girl girl) {
		System.out.println("我想和"+girl.getName()+"结婚");
	}
	public void shout() {
		if(this.age >= 22) {
			System.out.println("可以结婚登记");
		}else {
			System.out.println("还不能");
		}
	}
}

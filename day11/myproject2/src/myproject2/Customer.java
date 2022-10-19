package myproject2;

public class Customer {
	private int id;
	private String name;
	private String sex; 
	private int age;
	private String phone;
	private String mail;
	
	public Customer() {
		
	}
	
	public Customer(String name, String sex, int age, String phone, String mail) {

		this.name = name;
		this.sex = sex;
		this.age = age;
		this.phone = phone;
		this.mail = mail;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	
	/*
	 * public void addition() { Scanner put = new Scanner(System.in);
	 * 
	 * System.out.print("姓名："); this.name = put.nextLine(); System.out.print("性别：");
	 * this.sex = put.nextLine(); System.out.print("年龄："); this.age = put.nextInt();
	 * System.out.print("电话："); this.phone = put.nextLine();
	 * System.out.print("邮箱："); this.mail = put.nextLine();
	 * 
	 * put.close(); }
	 */
}

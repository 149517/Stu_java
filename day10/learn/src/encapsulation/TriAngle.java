package encapsulation;

public class TriAngle {
	private double base;
	private double height;
	// 构造器
	public TriAngle() {
		
	}
	public TriAngle(double a) {
		setBase(a);
		setHeight(a);
	}
	public TriAngle(double b,double h) { 
		setBase(b);
		setHeight(h);
	}
	
	// 方法
	public void setBase(double b) {
		if(b<=0) {
			throw new RuntimeException("传入的数据非法");
		}else {
			base = b;	
		}	
	}
	public double getBase() {
		
		return base;
	}
	
	public void setHeight(double h) {
		if(h<=0) {
			throw new RuntimeException("传入的数据非法");
		}else {
			height = h;	
		}
		
	}
	public double getHeight() {
		return height;
	}
	
	public double caculate() {
		return base * height / 2;
	}
	public double caculate(double b,double h) {
		setBase(b);
		setHeight(h);
		return base * height / 2;
	}
}

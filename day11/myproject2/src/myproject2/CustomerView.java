package myproject2;
import java.util.Scanner;

public class CustomerView {
	public static void main(String[] args) {
		CustomerView 
		boolean isFlag = true;
		
		while(isFlag) {
			View view = new View();
			// ??????
			view.display();
			// ???????????ж?
			int op = view.input();
			// ???????????????
			System.out.println("??????");
			isFlag = view.jump(op);
		}
		

		
	}
//	private CustomerList customerList = new CustomerList(10);
	
	private void listAllCustomers() {
		System.out.println("----------------????б?------------");
		
		int total = customerList.getTotal();
		if(total == 0) {
			System.out.println("??п???????");
		}else {
			System.out.println("???\t????\t???\t????\t?绰\t\t????\t");
			Customer[] custs = customerList.getAllCustomers();
			for(int i = 0;i < custs.length;i++) {
				Customer cust = custs[i];
				System.out.println((i+1)+"\t"+cust.getName()+"\t"+
				cust.getSex()+"\t"+cust.getAge()+"\t"+
						cust.getPhone()+"\t"+cust.getMail());
			}
			
		}
		System.out.println("----------------????б????---------");
	}
	
}
class View{
	public void display() {
		System.out.println("----------------?????????????-----------");
		System.out.println("\t\t 1.?????");
		System.out.println("\t\t 2.?????");
		System.out.println("\t\t 3.??????");
		System.out.println("\t\t 4.????б?");
		System.out.println("\t\t 5.???");
		System.out.println("");
		System.out.println("????? ??1~5??:");
	}
	public int input() {
		Scanner scan = new Scanner(System.in);
		int op = scan.nextInt();
		if(1 > op || op > 5) {
			System.out.println("?????????????????:");
			this.input();
		}
		return op;
	}
	public boolean jump(int op) {
		switch(op) {
		case 1:
			System.out.print("today");
			return true;
		case 2:
			System.out.print("2");
			return true;
		case 3:
			System.out.print("3");
			return true;
		case 4:
			Customer customer = new Customer("wang","??",22,"23234232","12323@qq.com");
			customerList.addCustomer(customer);
			return true;
		default:
			System.out.println("????????? (Y / N)??");
			Scanner exit = new Scanner(System.in);
			char ex = exit.next().charAt(0);
			if (ex == 'Y' || ex == 'y') {
				System.out.print("???????");
				return false;
			}else {
				System.out.println("???");
				return true;
			}
		}
	}
}

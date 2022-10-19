package myproject2;

import java.util.Scanner;

public class CustomerList {
	private Customer[] customers;	// 用来保存对象的数组
	private int total = 0; 	// 记录已保存客户的数量
	
	// 用来初始化customers数组的构造器
	// totalCustomer:指定数组的长度
	public CustomerList(int totalCustomer) {
		customers = new Customer[totalCustomer];
	}
	// 将指定的客户添加到数组中
	// true 添加成功
	public boolean addCustomer(Customer customer) {
		if(total >= customers.length) {
			return false;
		}
		customers[total++] = customer;
		return true;
	}
	// 修改指定索引位置的客户信息
	public boolean replaceCustomer(int index, Customer cust) {
		if(index < 0 || index >= total) {
			return false;
		}
		customers[index] = cust;
		return true;
	}
	// 删除
	// 后面得全部往前移动
	public boolean delecteCustomer(int index) {
		if(index < 0 || index >= total) {
			return false;
		}
		for(int i = index;i<total - 1; i++) {
			customers[i] = customers[i+1];
		}
		// 最后有数据的元素要置空
		customers[--total] = null;
		return true;
	}
	// 获取所有客户信息
	public Customer[] getAllCustomers() {
		Customer[] cust = new Customer[total];
		for(int i = 0; i<total;i++) {
			cust[i] = customers[i];
		}
		return true;
	}
	// 获取指定位置的客户
	// 如果找到了元素就返回，没有找到就返回null
	public Customer getCustomer(int index) {
		if(index < 0 || index >= total) {
			return null;
		}
		return customers[index];
	}
	// 存储客户的数量
	public int getTotal() {
		return total;
	}
}

package project2;

public class CustomerList {


    Customer[] customers;   // 用来保存客户对象的数组
    int total = 0;          // 记录已保存客户对象的数量

    // 构造器，提供customer数组的最大空间，初始化customer数组
    public CustomerList(int totalCustomer) {
        customers = new Customer[totalCustomer];
    }

    // 方法

    // 将参数customer添加到数组中最后一个客户对象记录之后
    // customer 指定要添加的客户对象
    // 返回：添加成功返回true，false表示数组已满，无法添加
    public boolean addCustomer(Customer customer) {
        if (customers.length <= total) {
            return false;
        }
        customers[total++] = customer;
        return true;
    }

    // 用参数customer替换数组中由index指定的对象
    // 参数，customer 指定替换的新的客户对象
    // index 指定所替换对象在数组中的位置，从0开始
    // 返回，添加成功返回true，false表示数组已满无法替换
    public boolean replaceCustomer(int index, Customer cust) {
        if (total <= index || index < 0) {
            return false;
        }
        customers[index] = cust;
        return true;
    }

    // 从数组中删除参数index指定索引位客户对象记录
    // 参数index指定所删除对象在数组中的索引位置，从0开始

    public boolean deleteCustomer(int index) {
        if (total <= index || index < 0) {
            return false;
        }
        for (int i = index; i < total - 1; i++) {
            customers[i] = customers[i + 1];
        }
        // 将最后一个赋值为null
        customers[--total] = null;
        return true;
    }

    // 返回数组中记录的所有客户对象
    // 返回 Customer[] 数组中包含当前所有客户对象，该数组长度与对象个数相同
    public Customer[] getAllCustomers() {
        Customer[] custs = new Customer[total];
        for (int i = 0; i < total; i++) {
            custs[i] = customers[i];
        }
        return custs;
    }

    public Customer getCustomer(int index) {
        if (index < 0 || index >= total) return null;
        return customers[index];
    }

    public int getTotal() {
        return total;
    }

}

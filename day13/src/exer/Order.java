package exer;

public class Order {
    private int orderld;
    private String orderName;

    public Order(int orderld,String orderName){
        this.orderld = orderld;
        this.orderName = orderName;
    }

    public int getOrderld() {
        return orderld;
    }

    public void setOrderld(int orderld) {
        this.orderld = orderld;
    }

    public String getOrderName() {
        return orderName;
    }

    public void setOrderName(String orderName) {
        this.orderName = orderName;
    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        // 判断类是否是Order
        if(obj instanceof Order){
            // 向下转型
            Order order = (Order)obj;
            // 这里的equals是String中的equals方法，而不是递归
            return this.orderld == order.orderld && this.orderName.equals(order.orderName);
        }
        return false;
    }

}

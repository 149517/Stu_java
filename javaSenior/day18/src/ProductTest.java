/**
 * 线程的通信：经典例题 生产者 / 消费者
 *
 * 生产者（Product) 将产品交给店员（Clerk），而消费者（Customer）从店员处取走产品，
 * 店员一次只能持有固定数量的产品（），如果生产者试图生产更多的产品，店员会叫生产者
 * 停一下，如果店中有空位放产品了再通知生产者继续生产，如果店中没有产品了，店员会告
 *  诉消费者等一下，如果店中有产品了再通知消费者来取走产品
 *
 *  分析：
 *  1. 涉及多线程，生产者和消费者线程
 *  2. 有共享数据，产品
 *  3. 需要解决线程安全问题
 *  4. 涉及线程通信
 */


public class ProductTest {
    public static void main(String[] args) {
        Clerk clerk = new Clerk();

        Producer p1 = new Producer(clerk);
        p1.setName("生产者");

        Consumer c1 = new Consumer(clerk);
        c1.setName("消费者1");

        p1.start();
        c1.start();
    }
}
class Clerk{

    private int productCount = 0;
    // 生产产品
    public synchronized void produceProduct() {
        if(productCount < 10){
            productCount++;
            System.out.println(Thread.currentThread().getName()+" ：开始生产第 "+ productCount+ " 个产品");
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    // 消费产品
    public synchronized void consumeProduct() {
        if(productCount > 0){
            System.out.println(Thread.currentThread().getName()+" ：开始消费第 "+ productCount+ " 个产品");
            productCount--;
            notify();
        }else{
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
class Producer extends Thread{
    private Clerk clerk;

    public Producer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName()+"  开始生产产品。。。。");
        while(true){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.produceProduct();
        }
    }
}
class Consumer extends Thread{
    private Clerk clerk;

    public Consumer(Clerk clerk){
        this.clerk = clerk;
    }

    @Override
    public void run() {
        System.out.println(getName() + "  开始消费产品。。。");
        while(true){
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            clerk.consumeProduct();
        }
    }
}

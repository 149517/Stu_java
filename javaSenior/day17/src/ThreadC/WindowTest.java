package ThreadC;

public class WindowTest{
    public static void main(String[] args) {
        Window s1 = new Window();
        Window s2 = new Window();
        Window s3 = new Window();

        s1.setName("窗口1");
        s2.setName("窗口2");
        s3.setName("窗口3");
        s1.start();
        s2.start();
        s3.start();

    }
}
class Window extends Thread{
    private static int ticket = 100;

    @Override
    public void run() {
        while(true)
            if(ticket > 0 ){
                System.out.println(getName() + ": 出票成功 ，票号为："+ ticket);
                ticket--;
            }else{
                break;
            }
    }
}

package ThreadC;

public class ThreadPriority {
    public static void main(String[] args) {



        new Thread() {
            @Override
            public void run() {
                currentThread().setPriority(4);
                for (int i = 0; i < 101; i++) {
                    if (i % 3 == 0) {
                        System.out.println(currentThread().getName() + getPriority() + "  " + i);

                    }
                }
            }
        }.start();

        for (int i = 0; i < 101; i++) {
            if (i % 5 == 0) {
                System.out.println(Thread.currentThread().getName() + Thread.currentThread().getPriority() + "  " + i);

            }
        }
    }
}


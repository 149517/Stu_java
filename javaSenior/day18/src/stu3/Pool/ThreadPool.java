package stu3.Pool;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadPool {
    public static void main(String[] args) {
        // 1. 提供指定数量的线程池
        ExecutorService service = Executors.newFixedThreadPool(10);



//        // 设置线程池的属性
//        System.out.println(service.getClass());
//        // ThreadPoolExecutor是ExecutorService的实现类
//        ThreadPoolExecutor service1 = (ThreadPoolExecutor)service;
//        service1.setCorePoolSize(15);
//        service1.setKeepAliveTime();

        // 2. 执行指定的线程的操作，需要提供 Runnable 接口或 Callable 接口实现类的对象
        service.execute(new NumberThread());  // 使用于Runnable
//        service.submit();   // 使用于 Callable
        // 3. 关闭线程池
        service.shutdown();
    }
}

class NumberThread implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 101; i++) {
            if (i % 2 != 0) {
                System.out.println(Thread.currentThread().getName() + i);
            }
        }
    }
}

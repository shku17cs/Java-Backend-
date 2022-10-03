package threadpoolusingexecutor;



        import java.util.Collection;
        import java.util.List;
        import java.util.concurrent.AbstractExecutorService;
        import java.util.concurrent.Callable;
        import java.util.concurrent.Future;
        import java.util.concurrent.TimeUnit;
        import java.util.concurrent.atomic.AtomicInteger;

public class MyTask<Flight> implements Runnable{
    private int num;

    public MyTask(int num) {
        this.num = num;
    }

    @Override
    public void run() {
        System.out.println("Task no " + num + " Running in : " + Thread.currentThread().getName());
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }



}
package threadpoolusingexecutor;

import java.util.Collection;
import java.util.List;
import java.util.concurrent.*;

public class executorDemo {

    public static void main(String[] args) {
        ExecutorService ex=Executors.newFixedThreadPool(5);
        for(int i=0;i<10;i++)
        {
            ex.submit(new MyTask(23));
        }

        ex.shutdown();
//        executorService.shutdownNow();

//        executorService.submit(new MyTask(21));

        while (!ex.isTerminated()){
            ;
        }
        System.out.println("completed task");

    }
}

import java.util.ArrayList;
import java.util.List;

public class MultiThreadedBigPrimes {
    public static <List> void main(String[] args) throws InterruptedException {
        Long start = System.currentTimeMillis();
        Results results = new Results();
        Runnable task = new PrimeGenerator(results);
        java.util.List<Thread> threads = new ArrayList<>();
        for(int i =0; i < 20; i++){
            Thread t = new Thread(task);
            threads.add(t);
            t.start();
        }
        for(Thread t : threads){
            t.join();
        }
        System.out.println(results.getPrimes());
        Long end = System.currentTimeMillis();
        System.out.println("Time Taken :"+(end - start)+" ms.");
    }
}

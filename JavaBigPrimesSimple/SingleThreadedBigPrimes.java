import java.math.BigInteger;
import java.util.Random;
import java.util.SortedSet;
import java.util.TreeSet;

/*
As we are using single thread, it will not use others processors that we have in our system
hence CPU utilization will never go 100% --> that can be used by Multithreading
 */
public class SingleThreadedBigPrimes {
    public static void main(String[] args) {

        Long start = System.currentTimeMillis();
        SortedSet<BigInteger> primes = new TreeSet<>();

        while(primes.size() < 20){
            // Creating random number from 0 to 2^2000 - 1
            BigInteger bigInteger = new BigInteger(2000, new Random());
            primes.add(bigInteger.nextProbablePrime());
        }
        Long end = System.currentTimeMillis();
        System.out.println(primes);
        System.out.println("The time taken was : "+(end - start)+" ms.");
    }
}

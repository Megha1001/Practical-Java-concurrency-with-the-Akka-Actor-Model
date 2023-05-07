import java.math.BigInteger;
import java.util.SortedSet;
import java.util.TreeSet;

public class Results {
    private SortedSet<BigInteger> primes;

    public Results(){
        primes = new TreeSet<>();
    }

    //Not thread safe
//    public SortedSet<BigInteger> getPrimes(){
//        return primes;
//    }

    //Thread safe

    public int getSize(){
        synchronized (this) {
            return primes.size();
        }
    }

    public void addPrime(BigInteger prime){
        synchronized (this){
            primes.add(prime);
        }
    }

    public void print(){
        synchronized (this){
            primes.forEach(System.out::print);
        }
    }

}

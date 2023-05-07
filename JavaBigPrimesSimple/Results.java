import java.math.BigInteger;
import java.util.SortedSet;
import java.util.TreeSet;

public class Results {
    private SortedSet<BigInteger> primes;

    public Results(){
        primes = new TreeSet<>();
    }

    public SortedSet<BigInteger> getPrimes(){
        return primes;
    }

}

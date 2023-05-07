import java.math.BigInteger;
import java.util.Random;

public class PrimeGenerator implements Runnable{

    private Results results;

    public PrimeGenerator(Results results){
        this.results = results;
    }
    @Override
    public void run() {
        // Creating random number from 0 to 2^2000 - 1
        BigInteger bigInteger = new BigInteger(2000, new Random());
        results.addPrime((bigInteger.nextProbablePrime()));
    }
}

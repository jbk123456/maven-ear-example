import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParallelPrime  {
    public static void main(String[] args) {
        long t0 = System.currentTimeMillis();
        long count = Stream.iterate(0, n -> n + 1)
        .limit(2_000_000)
        .parallel()  // with this 23s, without this 1m 10s
        .filter(ParallelPrime::isPrime)
        //.peek(x -> System.out.format("%s\t", x))
        .count();
        
        System.out.println("\nTotal: " + count);

        long t1 = System.currentTimeMillis();
        System.err.println(String.format("time: %.2f\n",(t1-t0)/1000.));
        
    }
    
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        return !IntStream.rangeClosed(2, number / 2).anyMatch(i -> number % i == 0);
    }
}
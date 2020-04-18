package org.rootservices.fibonacci;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.List;

/**
 * WikiPedia
 * "In mathematics, the Fibonacci numbers are the numbers in the following integer sequence, called the Fibonacci
 * sequence, and characterized by the fact that every number after the first two is the sum of the two preceding ones:"
 *
 *   0, 1, 1, 2, 3, 5, 8, 13, 21, 34
 *
 */
public class Fibonacci {
    private static final Logger LOGGER = LogManager.getLogger(Fibonacci.class);


    /**
     * Non recursive fibonacci algorithm.
     *
     *
     * @param n
     * @return
     */
    protected Long fibonacci(Integer n){
        if(n <= 1){
            return n.longValue();
        }

        Long fibo = 1L;
        Long fiboPrev = 1L;

        for(int i = 2; i < n; ++i){
            Long temp = fibo;
            fibo += fiboPrev;
            fiboPrev = temp;
        }
        return fibo;
    }
    /**
     * Recursive fibonacci implementation. Fibonacci is a recurrence relation, when implemented recursively then XXX
     *
     * When n is 45 Then
     *
     * @param n the Fn to calculat for
     * @return the fibonacci sequence n
     */
    protected Long fibonacciRecursive(Integer n) {
        if (n <= 1) return n.longValue();
        else return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
    }

    public List<Long> sequence(Integer n) {
        List<Long> sequence = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            Long Fn = fibonacciRecursive(i);
            sequence.add(Fn);
            LOGGER.debug("{} : {}", i, Fn);
        }
        return sequence;
    }

}

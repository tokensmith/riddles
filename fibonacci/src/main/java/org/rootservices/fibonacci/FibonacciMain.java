package org.rootservices.fibonacci;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.List;
import java.util.Scanner;

public class FibonacciMain {
    private static final Logger LOGGER = LogManager.getLogger(FibonacciMain.class);

    public static void main(String[] args) {
        System.out.println("Enter Fn:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        Integer Fn = Integer.parseInt(input);

        Fibonacci fibonacci = new Fibonacci();
        List<Long> sequence = fibonacci.sequence(Fn);
        LOGGER.info(sequence);
    }
}

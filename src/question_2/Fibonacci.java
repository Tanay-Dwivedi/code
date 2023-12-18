package question_2;

import java.util.*;

public class Fibonacci {
    public static void main(String[] args) {

        int numberOfTerms = 10, previousTerm = 0, currentTerm = 1;
        System.out.println("Modified Fibonacci Series till " + numberOfTerms + " terms:");
        List<Integer> fibonacciList = new ArrayList<>();

        for (int i = 1; i <= numberOfTerms; ++i) {
            fibonacciList.add(previousTerm);

            // Finding the next term in the series
            int nextTerm = previousTerm + currentTerm;
            previousTerm = currentTerm;
            currentTerm = nextTerm;
        }
        System.out.println(fibonacciList);
    }
}

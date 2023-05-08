package org.nvware.question02;

import org.nvware.InputBufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */

class Result {
    /*
     * The function is expected to return an int.
     * The function accepts int i, int n as parameter.
     */
    public static String evenOddChecker(int num) {
        // Write your code here
        EvenOddChecker checker = (number) -> (number % 2 == 0) ? "even" : "odd";
        return checker.check(num);

    }

    interface EvenOddChecker {
        String check(int number);
    }
}

//Question 2: Write a Java program to check if a given number is even or odd. Implement it using a lambda expression.
public class Question02Solution {
    public static void main(String[] args) throws IOException {
        InputBufferedReader inputReader = new InputBufferedReader(new InputStreamReader(System.in));
        int num = inputReader.readInt();
        String result = Result.evenOddChecker(num);
        System.out.println(result);

        inputReader.close();
    }

}

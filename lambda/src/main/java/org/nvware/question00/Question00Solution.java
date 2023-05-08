package org.nvware.question00;

import org.nvware.InputBufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.IntStream;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
class Result {

    /*
     * The function is expected to return an int.
     * The function accepts int i, int n as parameter.
     */
    public static int sum(int i, int n) {
        // Write your code here
        return IntStream.rangeClosed(i, n).sum();

    }
}

//Question1 : Write a Java program to find the sum of all numbers from 1 to 10 using a loop.
public class Question00Solution {
    public static void main(String[] args) throws IOException {
        InputBufferedReader inputReader = new InputBufferedReader(new InputStreamReader(System.in));
        int i = inputReader.readInt();
        int n = inputReader.readInt();
        int result = Result.sum(i, n);
        System.out.println(result);

        inputReader.close();
    }

}

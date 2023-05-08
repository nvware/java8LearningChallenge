package org.nvware.question1;

import java.io.BufferedReader;
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
public class Question1Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine().trim());
        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result.sum(i, n);
        System.out.println(result);

        bufferedReader.close();
    }
}

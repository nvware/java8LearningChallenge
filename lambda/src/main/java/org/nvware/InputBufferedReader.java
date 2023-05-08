package org.nvware;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputBufferedReader {
    private BufferedReader reader;

    public InputBufferedReader(InputStreamReader in) {
        this.reader = new BufferedReader(in);
    }

    public String readLine() throws IOException {
        return reader.readLine();
    }

    public int readInt() throws IOException {
        String input = readLine();
        try {
            return Integer.parseInt(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + input + ". Expected an integer.");
        }
    }

    public long readLong() throws IOException {
        String input = readLine();
        try {
            return Long.parseLong(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + input + ". Expected a long.");
        }
    }

    public double readDouble() throws IOException {
        String input = readLine();
        try {
            return Double.parseDouble(input);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid input: " + input + ". Expected a double.");
        }
    }

    public String[] readStringArray(String separator) throws IOException {
        String input = readLine();
        return input.split(separator);
    }

    public void close() throws IOException {
        reader.close();
    }
}

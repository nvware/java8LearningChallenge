package org.nvware;

import org.junit.Test;
import org.nvware.question1.Question1Solution;

import java.io.IOException;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class Question1SolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase0() throws IOException {
        // Prepare test input
        String input = "1\n" +
                "10\n";
        String expectedOutput = "55\r\n"; // Insert expected output here
        runTestCase(input, expectedOutput, () -> {
            try {
                Question1Solution.main(null);
            } catch (IOException e) {
                logger.error("An IOException occurred during test execution", e);
                throw new RuntimeException(e);
            }
        });
    }
}

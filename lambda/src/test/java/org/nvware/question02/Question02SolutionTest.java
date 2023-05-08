package org.nvware.question02;

import org.junit.Test;
import org.nvware.RedirectedOutputTest;
import org.nvware.question00.Question00Solution;

import java.io.IOException;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class Question02SolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase0() throws IOException {
        // Prepare test input
        String input = "7\n";
        String expectedOutput = "odd\r\n"; // Insert expected output here
        runTestCase(input, expectedOutput, () -> {
            try {
                Question02Solution.main(null);
            } catch (IOException e) {
                logger.error("An IOException occurred during test execution", e);
                throw new RuntimeException(e);
            }
        });
    }
}

package org.nvware.question01;

import org.junit.Test;
import org.nvware.RedirectedOutputTest;

import java.io.IOException;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class Question01SolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase0() throws IOException {
        // Prepare test input
        String input = "World\n";
        String expectedOutput = "Hello World!\r\n"; // Insert expected output here
        runTestCase(input, expectedOutput, () -> {
            try {
                Question01Solution.main(null);
            } catch (IOException e) {
                logger.error("An IOException occurred during test execution", e);
                throw new RuntimeException(e);
            }
        });
    }
}

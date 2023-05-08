package org.nvware;
import org.junit.Test;

import java.io.IOException;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
import org.junit.Test;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
public class MainSolutionTest implements RedirectedOutputTest {
    @Test
    public void sampleTestCase0() throws IOException {
        // Prepare test input
        String input = "World\n";
        String expectedOutput = "Hello World!\r\n"; // Insert expected output here
        runTestCase(input, expectedOutput, () -> {
            try {
                MainSolution.main(null);
            } catch (IOException e) {
                logger.error("An IOException occurred during test execution", e);
                throw new RuntimeException(e);
            }
        });
    }
}

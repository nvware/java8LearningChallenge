package org.nvware;

/**
 * @author <a href="mailto:nvware">Hamid Valizadegan</a>
 * Modified by <a href="mailto:nvware">Hamid Valizadegan</a>
 */
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static org.junit.Assert.assertEquals;

public interface RedirectedOutputTest {
    static final Logger logger = LogManager.getLogger(RedirectedOutputTest.class);

    ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    PrintStream originalOut = System.out;

    public default void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    public default void restoreStreams() {
        System.setOut(originalOut);
    }

    public default String getOutput() {
        return outContent.toString();
    }

    public default void runTestCase(String input, String expectedOutput, Runnable mainMethod) {
        System.setIn(new ByteArrayInputStream(input.getBytes())); //set inputStream to system.in

        logger.info("Test Input (stdin): {}", input); // Log the test input
        logger.info("Test Expected Output: {}", expectedOutput); // Log the test expectedOutput

        setUpStreams(); // Redirect output to a ByteArrayOutputStream

        // Call main method
        mainMethod.run();

        // Verify the output
        String result = "";
        String outs = getOutput();
        logger.info("Test Your Output (stdout): {}", outs); // Log the test outs
        try {
            assertEquals(expectedOutput, outs);
            result = "Test passed!"; // Print out a message indicating that the test has passed
        } catch (AssertionError e) {
            result = "Wrong Answer :(";
            logger.error("AssertionError occurred during test execution", e);
        } finally {
            restoreStreams(); // Restore the original System.out and System.in
            logger.info("runTestCase");
            logger.info("Test Result: {}", result); // Log the test result
        }
    }
}


package view;

import java.util.ArrayList;

/**
 * Serves as a contract for all methods of output for the KWICv2 application.
 * Ensures that all output methods provide the same functionality to the
 * controller component.
 */
public interface iOutput {

    /**
     * Displays the supplied ArrayList of output to the user.
     * @param output ArrayList of String values to output
     */
    abstract void writeOutput(ArrayList<String> output);

    /**
     * Displays the supplied ArrayList of output to the user.  Includes a
     * boolean flag determining whether this is an error result or not.
     * @param output ArrayList of String values to output
     * @param isError boolean value indicating if result is an error or not
     */
    abstract void writeOutput(ArrayList<String> output, boolean isError);
}

package view;

import java.util.ArrayList;

public class TextFile implements iOutput {
    /**
     * Displays the supplied ArrayList of output to the user.
     *
     * @param output ArrayList of String values to output
     */
    @Override
    public void writeOutput(ArrayList<String> output) {
        // Write output to a designated file
    }

    /**
     * Displays the supplied ArrayList of output to the user.  Includes a
     * boolean flag determining whether this is an error result or not.
     *
     * @param output  ArrayList of String values to output
     * @param isError boolean value indicating if result is an error or not
     */
    @Override
    public void writeOutput(ArrayList<String> output, boolean isError) {
        // If isError, do not create output file
    }
}

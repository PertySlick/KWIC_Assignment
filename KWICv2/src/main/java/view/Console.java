// Console.java  ::  KWICv2  ::  Timothy Roush  ::  May 5th, 2018  ::  Output method for displaying results on console.

package view;

import java.util.ArrayList;

public class Console implements iOutput {

    public Console() {
        // Returns an instance of this Console output object.
    }

    /**
     * Displays the supplied ArrayList of output to the user.
     *
     * @param output ArrayList of String values to output
     */
    @Override
    public void writeOutput(ArrayList<String> output) {
        // Set output to non-error values
        // Output result to user on the console
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
        // Set output to error values (style, font)
        // Output result to user on the console
    }
}

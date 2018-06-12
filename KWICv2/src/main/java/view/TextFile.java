package view;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class TextFile implements iOutput {
    /**
     * Displays the supplied ArrayList of output to the user.
     *
     * @param output ArrayList of String values to output
     */
    @Override
    public void writeOutput(ArrayList<String> output) {
        FileWriter file;
        BufferedWriter outputStream = null;

        System.out.println("Results: \n");

        try {
            file = new FileWriter("output.txt");
            outputStream = new BufferedWriter(file);
            for (String line : output) {
                outputStream.write(line);
                outputStream.newLine();
                System.out.println(line);
            }
            outputStream.close();
            file.close();
        } catch (IOException e ) {
            System.out.println("(!) There was an error writing file: output.txt");
            System.exit(1);
        }
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
        writeOutput(output);
        if (isError) { System.out.println("\n(!) Completed with erros..."); }
    }
}

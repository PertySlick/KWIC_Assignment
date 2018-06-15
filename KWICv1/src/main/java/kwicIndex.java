import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringJoiner;

/**
 * Reads input from a local file named "input.txt" and performs a circular
 * shift on each line.  A circular shift is the shifting of the first word
 * to the end of the line.  Results are then sorted alphabetically and output
 * to the console as well as a local file named "output.txt".
 */
public class kwicIndex {

    private static ArrayList<String> lines = new ArrayList<>();

    /**
     * Primary method the handles reading of input, performing the circular
     * shift, then sorts and outputs the results.
     * @param args
     */
    public static void main(String[] args) {
        readLines();
        circularShift();
        alphabetizeLines();
        writeLines();
    }


    // Read input from a file
    private static void readLines() {
        FileReader file;
        BufferedReader inputStream = null;
        String line;

        try {
            file = new FileReader("input.txt");
            inputStream = new BufferedReader(file);
            while ((line = inputStream.readLine()) != null) {
                lines.add(line);
            }
            inputStream.close();
            file.close();
        } catch (FileNotFoundException e) {
            System.out.println("(!) There was an error reading file: input.txt");
            System.exit(1);
        } catch (IOException e) {
            System.out.println("(!) There was an error reading file: input.txt");
            System.exit(1);
        }
    }

    // Perform a circular shift on every line
    private static void circularShift() {
        ArrayList<String> newLines = new ArrayList<>();
        for (String line : lines) {
            line = circularShiftLine(line);
            newLines.add(line);
        }
        lines = newLines;
    }

    // Shift first word of supplied string to the end of the line
    private static String circularShiftLine(String line) {
        String firstWord = "";
        String[] words = line.split(" ");
        StringJoiner joiner = new StringJoiner(" ");
        if (words.length < 1) {
            firstWord = "";
        }
        if (words.length > 1) {
            firstWord = words[0];
            for (int i = 1; i < words.length; i++) {
                joiner.add(words[i]);
            }
        }
        joiner.add(firstWord);
        return joiner.toString();
    }

    // Sort the collection alphabetically
    private static void alphabetizeLines() {
        Collections.sort(lines);
    }

    // Output all lines to the console and file
    private static void writeLines() {
        FileWriter file;
        BufferedWriter outputStream = null;

        System.out.println("Results: ");
        System.out.println();

        try {
            file = new FileWriter("output.txt");
            outputStream = new BufferedWriter(file);
            for (String line : lines) {
                outputStream.write(line);
                outputStream.newLine();
                System.out.println(line);
            }
            outputStream.close();
            file.close();
        } catch (IOException e ) {
            System.out.println("(!) There was an error writing file: input.txt");
            System.exit(1);
        }
    }
}
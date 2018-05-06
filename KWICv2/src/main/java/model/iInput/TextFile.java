package model.iInput;

import java.util.ArrayList;

public class TextFile implements iInput {


    public TextFile(String uri) {
        // Returns an instance of a TextFile object.
        // If file is found, read the contents one line at a time into an
        // ArrayList
    }

    /**
     * Returns input from the selected source as a String based ArrayList of
     * elements.  Each element represents a line of text from the supplied
     * source.  URI must be in proper form including scheme.
     * Example: "file://input.txt"
     *
     * @param uri Proper URI to locate the requested input data source
     * @return ArrayList of String values
     */
    @Override
    public ArrayList<String> getInputFromSource(String uri) {
        return null;
    }
}

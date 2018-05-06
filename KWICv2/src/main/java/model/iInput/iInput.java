// model.iInput.java  ::  KWICv2  ::  Timothy Roush  ::  May 5th, 2018  ::  Model input method interface

package model.iInput;

import java.util.ArrayList;

/**
 * Serves as a contract for all methods of input for the KWICv2 application.
 * Ensures that all input methods provide the same functionality to the model
 * component.
 */
public interface iInput {

    /**
     * Returns input from the selected source as a String based ArrayList of
     * elements.  Each element represents a line of text from the supplied
     * source.  URI must be in proper form including scheme.
     * Example: "file://input.txt"
     * @param uri Proper URI to locate the requested input data source
     * @return ArrayList of String values
     */
    abstract ArrayList<String> getInputFromSource(String uri);
}

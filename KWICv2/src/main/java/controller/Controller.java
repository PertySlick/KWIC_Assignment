package controller;

import com.sun.org.apache.xml.internal.utils.NameSpace;
import model.Model;
import model.iInput.iInput;
import view.iOutput;

public class Controller {

    private iOutput view;
    private Model model;
    private boolean debugMode = false;

    public Controller(NameSpace args) {
        // Determine input strategy from parameters
        // Initialize the Model component with input strategy
        // Determine and set output strategy from parameters
        // Return an instance of a Controller object
    }

    private iInput determineInputStrategy() {
        // Parse supplied URI to determine what iInput Strategy to implement
        // Create the model.iInput Strategy and return it
        // Throw exception if not a valid strategy
        return null;
    }

    private void setOutputStrategy() {
        // Parse supplied parameter to determine what view.iOutput Strategy to implement
        // Create the view.iOutput Strategy and set it to global variable
        // Throw exception if not a valid strategy
    }

    private void setDebugMode(boolean isDebug) {
        // Set debug mode status
    }
}

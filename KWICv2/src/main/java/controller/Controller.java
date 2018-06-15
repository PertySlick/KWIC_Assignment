package controller;

import model.Model;
import model.iInput.TextFile;
import model.iInput.iInput;
import view.Console;
import view.TextFileOutput;
import view.iOutput;

public class Controller {

    private iOutput view;
    private Model model;
    private boolean debugMode = false;

    public Controller(String[] args) {
        iInput input = determineInputStrategy(args);
        this.view = setOutputStrategy(args);
        this.model = new Model(input);
    }

    private iInput determineInputStrategy(String[] args) {
        String inputStrategy = parseArgs(args, "--input");
        if (inputStrategy == null || inputStrategy.equals("textfile")){
            return new TextFile("input.txt");
        }
        else {
            throw new IllegalArgumentException("Invalid input argument received.");
        }
    }

    private iOutput setOutputStrategy(String[] args) {
        String outputStrategy = parseArgs(args, "--input");
        if (outputStrategy == null || outputStrategy.equals("console")){
            return new Console();
        } else if (outputStrategy.equals("text")){
            return new TextFileOutput();
        } else {
            throw new IllegalArgumentException("Invalid output argument received.");
        }
    }

    private String parseArgs(String[] args, String flag) {
        for (int i = 0; i < args.length; i++) {
            if (args[i].equals(flag)) {
                if (i+1 <= args.length) { return args[i+1]; }
                else { return null; }
            }
        }
        return null;
    }

    private void setDebugMode(boolean isDebug) {
        this.debugMode = isDebug;
    }
}

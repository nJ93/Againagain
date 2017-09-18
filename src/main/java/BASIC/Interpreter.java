package BASIC;

import java.util.Map;
import java.util.TreeMap;

/**
 * Created by Admin on 24.07.2017.
 */
public class Interpreter {

    private TreeMap<Integer, Operator> code = new TreeMap<>();
    private int curLineNumber;
    private Map<String, Double> vars = new TreeMap<>();

    public void nextLine(){

    }

    public void goToLine(int num){

    }

    public void parse(){

    }

    public Map<String, Double> getVars() {
        return vars;
    }
}

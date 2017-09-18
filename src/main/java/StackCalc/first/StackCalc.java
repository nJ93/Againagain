package StackCalc.first;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;

public class StackCalc {
    private static Stack<Double> stack = new Stack<>();
    private static String[] array;

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            String operation = reader.readLine();
            while (!operation.equals("")){
                array = operation.split(" ");
                if(array[0].equals("PUSH")){
                    stack.push(Double.parseDouble(array[1]));
                } else if (array[0].equals("ADD")){
                    stack.push(stack.pop() + stack.pop());
                } else if (array[0].equals("PRINT")){
                    System.out.println(stack.toString());
                } else if (array[0].equals("POP")){
                    System.out.println(stack.pop().toString());
                } else if (array[0].equals("MUL")){
                    stack.push(stack.pop() * stack.pop());
                } else if (array[0].equals("DIV")){
                    stack.push(stack.pop() / stack.pop());
                } else if (array[0].equals("SUB")){
                    stack.push(stack.pop() + stack.pop());
                }
                operation = reader.readLine();
            }
        } catch (Exception e){
            e.printStackTrace();
        }

    }

}

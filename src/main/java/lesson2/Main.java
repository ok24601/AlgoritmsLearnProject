package lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static jdk.nashorn.internal.runtime.JSType.isNumber;

public class Main {

    public static void main(String[] args) {

    }

    public static void reverseWord(String word) {
        Stack<Character> wordStack = new Stack<>();
        for(int i = 0; i < word.length(); i++)
            wordStack.push(word.charAt(i));

        while (!wordStack.isEmpty())
            System.out.print(wordStack.pop());

        System.out.println();
    }

    // Homework!
/*    public static void parseMath(String expr) {
        Stack<Character> operands = new Stack<>();
        Stack<Character> operators = new Stack<>();

        for(int i = 0; i < expr.length(); i++) {
            char cur = expr.charAt(i);
            if(operators.size() > 0 && operands.size() > 1) {
                int a = operands.pop();
                int b = operands.pop();
                char op = operators.pop();
                int res = 0;
                switch (op) {
                    case '+':
                        res = a + b;
                        break;
                    case '-':
                        res = a - b;
                        break;
                    case '/':
                        res = a / b;
                        break;
                    case '*':
                        res = a * b;
                        break;
                }
                operands.push((char) res);
            }
            else if(isNumber(cur)) {
                operands.push(cur);
            }
            else if(cur == '+' || cur == '-' || cur == '/' || cur == '*') {
                operators.push(cur);
            }
        }
        System.out.println(operands.pop());

    }*/

    public static void checkBrackets(String expr) {
        Map<Character,Character> brakets = new HashMap<>();
        brakets.put('{','}');
        brakets.put('[',']');
        brakets.put('(',')');
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < expr.length(); i++) {
            char curr = expr.charAt(i);
            if(curr == '{' || curr == '[' || curr == '(')
                stack.push(expr.charAt(i));
            if(curr == '}' || curr == ')' || curr == ']') {
                char last = stack.pop();
                if(curr != brakets.get(last)) {
                    System.out.println("Don't match!");
                    return;
                }
            }
        }
        System.out.printf("Expr %s match! \n", expr);
    }

}


package lesson2;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        reverseWord("oleg");
        checkBrackets("a{b(c[d]e)f}");
    }

    public static void reverseWord(String word) {
        Stack<Character> wordStack = new Stack<>();
        for(int i = 0; i < word.length(); i++)
            wordStack.push(word.charAt(i));

        while (!wordStack.isEmpty())
            System.out.print(wordStack.pop());

        System.out.println();
    }

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


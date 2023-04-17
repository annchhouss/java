import java.util.Deque;
import java.util.Map;
class hw4 {
public static boolean isCorrectParentheses(String parentheses) {
    Map<Character, Character> mapping = new HashMap<>();
    mapping.put('(', ')');
    mapping.put('{', '}');
    mapping.put('[', ']');
    mapping.put('<', '>');

    Deque<Character> stack = new ADeque<>();

    for (int i = 0; i < parentheses.length(); i++) {
        char ch = parentheses.charAt(i);
        if (mapping.containsKey(ch)) {
            stack.push(ch);
        } else if (mapping.containsValue(ch)) {
            if (stack.isEmpty() || mapping.get(stack.peek()) != ch) {
                return false;
            }
            stack.pop();
        }
    }
    return stack.isEmpty();
}
}

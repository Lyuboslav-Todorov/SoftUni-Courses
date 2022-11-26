package implementations;

import interfaces.Solvable;


public class BalancedParentheses implements Solvable {
    private String parentheses;

    public BalancedParentheses(String parentheses) {
        this.parentheses = parentheses;
    }

    @Override
    public Boolean solve() {
        for (int i = 0; i < this.parentheses.length() / 2; i++) {
            char firstChar = this.parentheses.charAt(i);
            char secondChar = this.parentheses.charAt(this.parentheses.length() - i - 1);

            if (firstChar == '['&& secondChar == ']'){
                continue;
            } else if (firstChar == '('&& secondChar == ')'){
                continue;
            } else if (firstChar == '{'&& secondChar == '}'){
                continue;
            } else {
                return false;
            }
        }

        return true;
    }
}

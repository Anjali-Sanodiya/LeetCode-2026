import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        StringBuilder sb = new StringBuilder();

        backtrack(sb, 0, 0, n, result);

        return result;
    }

    private void backtrack(
        StringBuilder sb,
        int open,
        int close,
        int n,
        List<String> result
    ) {
        // Base case
        if (open == n && close == n) {
            result.add(sb.toString());
            return;
        }

        // Choice 1: Add opening bracket
        if (open < n) {
            sb.append('(');

            backtrack(sb, open + 1, close, n, result);

            sb.deleteCharAt(sb.length() - 1);
        }

        // Choice 2: Add closing bracket
        if (close < open) {
            sb.append(')');

            backtrack(sb, open, close + 1, n, result);

            sb.deleteCharAt(sb.length() - 1);
        }
    }
    
}
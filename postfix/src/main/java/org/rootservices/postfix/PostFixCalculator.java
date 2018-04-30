package org.rootservices.postfix;

import java.util.List;
import java.util.Stack;

public class PostFixCalculator {

    public Integer calculate(String input) {
        List<String> parsedItems = List.of(input.split(" "));

        Stack<Integer> items = new Stack();
        for(String item: parsedItems) {
            Integer number = null;
            try {
                number = Integer.parseInt(item);
            } catch (NumberFormatException e) {
                number = doOperator(items, item);
            }
            items.push(number);
        }
        return items.pop();
    }

    protected Integer doOperator(Stack<Integer> items, String item) {
        Integer last2 = items.pop();
        Integer last1 = items.pop();

        if (item.equals("+")) {
            return add(last1, last2);
        } else if (item.equals("-")) {
            return minus(last1, last2);
        } else if (item.equals("/")) {
            return divide(last1, last2);
        }
        return 0;
    }

    public Integer add(Integer val1, Integer val2) {
        return val1 + val2;
    }

    public Integer minus(Integer val1, Integer val2) {
        return val1 - val2;
    }

    public Integer divide(Integer val1, Integer val2) {
        return val1 / val2;
    }
}

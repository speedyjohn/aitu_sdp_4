package Classes.Part1;

import Interfaces.Part1.Expression;
// Part 1
public class Interpreter {
    public static int interpret(String expression) {
        String[] tokens = expression.split(" ");
        Expression result = new NumberExpression(Integer.parseInt(tokens[0]));

        for (int i = 1; i < tokens.length; i += 2) {
            char operator = tokens[i].charAt(0);
            Expression nextNumber = new NumberExpression(Integer.parseInt(tokens[i + 1]));
            result = new OperationExpression(result, nextNumber, operator);
        }

        return result.interpret();
    }
}

class Calculator {
    private int num1;
    private int num2;
    private char mathOperator;

    public int getNum1() { return num1; }
    public int getNum2() { return num2; }
    public char getMathOperator() { return mathOperator; }


    public void setFromInput(String input) {
        if (input.contains("+")) {
            mathOperator = '+';
        } else if (input.contains("-")) {
            mathOperator = '-';
        } else if (input.contains("*")) {
            mathOperator = '*';
        } else if (input.contains("/")) {
            mathOperator = '/';
        }

        int opIndex = input.indexOf(mathOperator);

        num1 = Integer.parseInt(input.substring(0, opIndex));
        num2 = Integer.parseInt(input.substring(opIndex + 1));
    }


    public int calculate() {
        switch (mathOperator) {
            case '+': return num1 + num2;
            case '-': return num1 - num2;
            case '*': return num1 * num2;
            case '/': return num1 / num2;
            default: return 0;
        }
    }
}



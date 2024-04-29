package Task2;

public class ArithmeticCalculator extends Calculator {

    ArithmeticCalculator() {}
    public double calculate(double a, double b, char operator) {
        double c=0;
        AddOperator addOperator = new AddOperator();
        SubtractOperator subtractOperator = new SubtractOperator();
        MultiplyOperator multiplyOperator = new MultiplyOperator();
        DivideOperator divideOperator = new DivideOperator();


        if (operator == '+') {
            c=addOperator.operate(a,b);
        }
        else if (operator == '-') {
            c=subtractOperator.operate(a,b);
        }
        else if (operator == '*') {
            c=multiplyOperator.operate(a,b);
        }
        else if (operator == '/') {
            c=divideOperator.operate(a,b);
        }
        else
        {
            throw new RuntimeException("적합한 연산자 기호가 아닙니다.");
        }

        return c;
    }
}

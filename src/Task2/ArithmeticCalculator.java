package Task2;

public class ArithmeticCalculator extends Calculator {

    AbstractOperation operation;
    ArithmeticCalculator(AbstractOperation abstractOperation) {
        operation = abstractOperation;
    }

    public void setOperation(AbstractOperation operation) {
        this.operation = operation;
    }

    public double calculate(double a, double b, char operator) {
        double c=0;

        if (operator == '+') {
            setOperation(new AddOperator());
        }
        else if (operator == '-') {
            setOperation(new SubtractOperator());
        }
        else if (operator == '*') {
            setOperation(new MultiplyOperator());
        }
        else if (operator == '/') {
            setOperation(new DivideOperator());
        }
        else if (operator == '%') {
            setOperation(new ModOperator());
        }
        else
        {
            throw new RuntimeException("적합한 연산자 기호가 아닙니다.");
        }

        c = operation.operate(a,b);

        return c;
    }
}

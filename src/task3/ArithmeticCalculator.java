package task3;

public class ArithmeticCalculator extends Calculator {
    public enum OperatorType {
        PLUS, MINUS, MULTIPLY, DIVIDE, MODULO
    }

    AbstractOperation operation;
    ArithmeticCalculator(AbstractOperation abstractOperation) {
        operation = abstractOperation;
    }

    public void setOperation(OperatorType opType) {
        switch (opType) {
            case PLUS:
                operation = new AddOperator();
                break;
            case MINUS:
                operation = new SubtractOperator();
                break;
            case MULTIPLY:
                operation = new MultiplyOperator();
                break;
            case DIVIDE:
                operation = new DivideOperator();
                break;
            case MODULO:
                operation = new ModOperator();
                break;
        }
    }

    public double calculate(double a, double b, char operator) {
        double c=0;

        OperatorType opType;

        if (operator == '+') {
            opType= OperatorType.PLUS;
        }
        else if (operator == '-') {
            opType= OperatorType.MINUS;
        }
        else if (operator == '*') {
            opType= OperatorType.MULTIPLY;
        }
        else if (operator == '/') {
            opType= OperatorType.DIVIDE;
        }
        else if (operator == '%') {
            opType= OperatorType.MODULO;
        }
        else
        {
            throw new RuntimeException("적합한 연산자 기호가 아닙니다.");
        }
        setOperation(opType);

        c = operation.operate(a,b);

        return c;
    }

    public void printGreaterResults(double n)
    {
        getArrayResults().stream().filter(num -> num > n).forEach(num -> {
            System.out.println(num);
        });
    }
}

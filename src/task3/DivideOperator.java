package task3;

public class DivideOperator extends AbstractOperation {
    public double operate(double a, double b) {
        if(b==0)
            throw new RuntimeException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
        //throw new ArithmeticException("Division by zero");
        return a / b;
    }
}

package Task2;

import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private ArrayList<Double> arrayResults = new ArrayList<Double>();

    public ArrayList<Double> getArrayResults() {
        return arrayResults;
    }

    public void setArrayResults(double n) {
        arrayResults.add(n);
    }
    public void removeResult() {
        if (arrayResults.size() > 0)
            arrayResults.remove(0);
    }
    /*
    public void setArrayResults(ArrayList<Double> arrayResults) {
        this.arrayResults = arrayResults;
    }
     */

    public double calculate(double a, double b, char operator) {
        double c=0;

        if (operator == '+') {
            c=a+b;
        }
        else if (operator == '-') {
            c=a-b;
        }
        else if (operator == '*') {
            c=a*b;
        }
        else if (operator == '/') {
            if(b==0)
                throw new RuntimeException("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                //throw new ArithmeticException("Division by zero");

            c=a/b;
        }
        else
        {
            throw new RuntimeException("적합한 연산자 기호가 아닙니다.");
        }

        return c;
    }
}

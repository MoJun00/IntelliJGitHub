package Task2;

import java.util.ArrayList;

public class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private ArrayList<Double> arrayResults = new ArrayList<Double>();

    Calculator()
    {
        arrayResults.clear();
        arrayCA.clear();
    }

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
    public void inquiryResults() {
        int i=0;
        for (double result : arrayResults) {
            System.out.println("Result " + (i+1) + " : " + result);
            i++;
        }
    }


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


    private static ArrayList<Double> arrayCA = new ArrayList<Double>();
    //Calculator 클래스를 여러개 만들어도 저장 값을 한 곳에 통일하기 위함 (클래스 처음 만들 때만 초기화 중)
    /* 원의 넓이를 구하는 메서드 선언*/
    public double calculateCircleArea(double radius) {
        /* 원의 넓이 계산 구현 */
        return 3.14*radius*radius;
    }
    /* 원의 넓이 저장 필드 Getter, Setter, 조회 메서드 구현 */
    public ArrayList<Double> getarrayCA() {
        return arrayCA;
    }

    public void setarrayCA(double n) {
        arrayCA.add(n);
    }

    public void Print_arrayCA() {
        int i=0;
        for (double result : arrayCA) {
            System.out.println("Result " + (i+1) + " : " + result);
            i++;
        }
    }

}

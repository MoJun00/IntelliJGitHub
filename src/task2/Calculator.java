package task2;

import java.util.ArrayList;

public abstract class Calculator {
    /* 연산 결과를 저장하는 컬렉션 타입 필드 선언 및 생성 */
    private ArrayList<Double> arrayResults = new ArrayList<Double>();

    Calculator()
    {
        arrayResults.clear();
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
}

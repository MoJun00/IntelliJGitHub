package task2;

public class CircleCalculator extends Calculator {

    static final double PI = 3.14; //3.14159265358979323846
    public double calculate(double radius) {
        /* 원의 넓이 계산 구현 */
        return PI*radius*radius;
    }
}

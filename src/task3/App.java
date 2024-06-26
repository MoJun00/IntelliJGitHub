package task3;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator calculator = new ArithmeticCalculator(new AddOperator());
        CircleCalculator circleCalculator = new CircleCalculator();

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("사칙 연산은 1번, 원의 너비는 2번을 선택해주세요 : ");
            int type = sc.nextInt();
            if (type == 1) {
                System.out.print("첫 번째 숫자를 입력하세요 : ");
                int num1 = sc.nextInt();
                System.out.print("두 번째 숫자를 입력하세요 : ");
                int num2 = sc.nextInt();

                System.out.print("사칙연산 기호를 입력하세요 : ");
                char operator = sc.next().charAt(0);

                try {
                    double result = calculator.calculate(num1,num2,operator);

                    calculator.setArrayResults(result);
                } catch (Exception e) {
                    System.out.println("에러 발생!!");
                    System.out.println(e.getMessage());
                }

                String answer;
                System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                answer = sc.next();
                if(answer.equalsIgnoreCase("remove"))
                    calculator.removeResult();

                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                answer = sc.next();
                if(answer.equalsIgnoreCase("inquiry")) {
                    calculator.inquiryResults();
                }

                System.out.println("숫자 n 보다 큰 결과값 출력 : ");
                calculator.printGreaterResults(sc.nextInt());

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                /* exit을 입력 받으면 반복 종료 */
                answer = sc.next();
                if(answer.equalsIgnoreCase("exit"))
                    break;
            }
            else if (type == 2) {
                System.out.print("반지름을 입력하세요 : ");
                double num1 = sc.nextDouble();

                double ac = circleCalculator.calculate(num1);
                circleCalculator.setArrayResults(ac);

                String answer;
                System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                answer = sc.next();
                if(answer.equalsIgnoreCase("inquiry")) {
                    circleCalculator.inquiryResults();
                }

                System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
                /* exit을 입력 받으면 반복 종료 */
                answer = sc.next();
                if(answer.equalsIgnoreCase("exit"))
                    break;
            }
            else
                System.out.println("1번 또는 2번을 선택해 주세요");
        }
    }
}

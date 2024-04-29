package Task1;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<Double> arrayResults = new ArrayList<Double>();
        int cnt = 0;

        while (true) {
            System.out.print("첫 번째 숫자를 입력하세요 : ");
            int firstNum = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.
            System.out.print("두 번째 숫자를 입력하세요 : ");
            int secondNum = sc.nextInt();
            // Scanner를 사용하여 양의 정수를 입력받고 적합한 타입의 변수에 저장합니다.

            System.out.print("사칙연산 기호를 입력하세요 : ");
            String operation = sc.next();

            double result = 0;

            if (operation.equals("+"))
                result = firstNum + secondNum;
            else if (operation.equals("-"))
                result = firstNum - secondNum;
            else if (operation.equals("*"))
                result = firstNum * secondNum;
            else if (operation.equals("/")) {
                if (secondNum == 0) {
                    System.out.println("나눗셈 연산에서 분모(두번째 정수)에 0이 입력될 수 없습니다.");
                    result = 0;
                } else
                    result = (double) firstNum / secondNum;
            }
            System.out.println("결과 : " + result);
            arrayResults.add(result);

            System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
            String answer1 = sc.next();
            if(answer1.equalsIgnoreCase("remove"))
                arrayResults.remove(0);

            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            /* exit을 입력 받으면 반복 종료 */
            String answer2 = sc.next();
            if(answer2.equalsIgnoreCase("exit"))
                break;
        }
    }
}

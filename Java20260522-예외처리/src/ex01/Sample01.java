package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample01 {
	
	public static void main(String[] args) {
		
		// try-with-resources 구문으로 Scanner 자원 자동 반납
        try (Scanner sc = new Scanner(System.in)) {
            
            System.out.print("첫 번째 정수를 입력하세요 (분자): ");
            int num1 = sc.nextInt(); // 문자가 입력되면 InputMismatchException 발생

            System.out.print("두 번째 정수를 입력하세요 (분모): ");
            int num2 = sc.nextInt();

            // 0으로 나누려 할 때 예외를 직접 발생시킵니다.
            if (num2 == 0) {
                throw new ArithmeticException("0으로 나눌 수 없습니다.");
            }

            // 나눗셈 수행 (소수점 결과까지 보기 위해 double로 형변환)
            double result = (double) num1 / num2;
            System.out.println("결과: " + num1 + " / " + num2 + " = " + result);

    		sc.close();
        } catch (InputMismatchException e) {
            // 정수가 아닌 문자나 실수를 입력했을 때 실행되는 블록
            System.out.println("[오류] 잘못된 입력입니다. 정수만 입력해 주세요.");
        } catch (ArithmeticException e) {
            // 0으로 나누려고 했을 때 실행되는 블록
            System.out.println("[오류] " + e.getMessage());
        } catch (Exception e) {
            // 혹시 모를 기타 예외 처리
            System.out.println("[오류] 알 수 없는 에러가 발생했습니다.");
        }
        
        System.out.println("프로그램이 안전하게 종료되었습니다.");

	}
	
}
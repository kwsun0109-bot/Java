package ex01;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample00 {
	
	public static void main(String[] args) throws InputMismatchException {
		
		Scanner sc = new Scanner(System.in);

        try {

            // 정수 입력
            System.out.print("첫 번째 정수 입력 : ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 정수 입력 : ");
            int num2 = sc.nextInt();
            // throw new ArithmeticException();

            // 나누기
            int result = num1 / num2;

            // 결과 출력
            System.out.println("나누기 결과 : " + result);
        } catch (InputMismatchException e) {
        	
            // 정수가 아닌 값을 입력한 경우
            System.out.println("정수만 입력 가능합니다.");
            sc.nextLine();

        } catch (ArithmeticException e) {

            // 0으로 나누는 경우
            System.out.println("0으로 나눌 수 없습니다.");

        } finally {

            // 무조건 실행
            System.out.println("프로그램 종료");
            sc.close();
        }

	}
	
}
import java.util.Scanner;
public class HomeWork2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("첫번째 숫자 :");
        int num1 = input.nextInt();

        System.out.println("두번쨰 숫자 :");
        int num2 = input.nextInt();

        int sum = 0;

        for(int i = num1; i <= num2; ++i) {
            sum += i;

        }
        System.out.println("두 값 사이의 정수의 합은 "  +sum +"입니다");
    }
}
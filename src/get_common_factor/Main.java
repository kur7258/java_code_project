package get_common_factor;

import java.util.Scanner;

public class Main {

    /**
     * 입력 받은 두 수의 최대공약수를 구해 출력해주는 함수
     * @param n1 첫 번째로 입력 받은 수
     * @param n2 두 번째로 입력 받은 수
     */
    static void get_factor(int n1, int n2)
    {
        int maxNum = (n1 > n2) ? n1 : n2; // num1이 크면 num1, num2가 크면 num2 삽입
        int factor = 0;

        for (int i=1; i<=maxNum; i++)
        {
            if((n1%i == 0) && (n2%i == 0))
            {
                factor = i;
            }
        }

        System.out.println("정답: " + factor);
    }


    public static void main(String[] args) {
        System.out.println("두 수를 입력하시오.");
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();

        get_factor(num1, num2);
    }
}

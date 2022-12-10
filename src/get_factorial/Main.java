package get_factorial;

import java.util.Scanner;

public class Main {

    /**
     * 입력받은 수의 팩토리얼을 구해주는 method
     * @param num 입력받은 자연수
     */
    static int getFactorial(int num)
    {
        int answer = 1;
        for (int i=1; i<=num; i++)
        {
            answer *= i;
        }

        return answer;
    }

    public static void main(String[] args) {
        System.out.println("자연수를 입력하세요.");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println("정답: "+ getFactorial(num));
    }
}

package get_sum_of_numbers;

import java.util.Scanner;

public class Main {

    /**
     * 입력받은 수의 각 자리의 수 합을 구해주는 method
     * @param num 입력받은 수
     * @return 각자리 수의 합
     */
    static int getSum(int num)
    {
        int n=10;
        int answer=0;
        while (num>0)
        {
            answer += num%n;
            num = num/n;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println("자연수를 입력하세요.");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        System.out.println("정답: " + getSum(num));
    }
}

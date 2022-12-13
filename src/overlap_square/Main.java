package overlap_square;

import java.util.Scanner;

public class Main {

    /**
     * 입력된 수(n) 만큼 n행 n열의 사각형을 만드는 함수
     * @param n 입력받은 자연수
     */
    static void print_square(int n)
    {
        int count = 1;
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                System.out.printf("%4d", count);
                count ++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        System.out.println("자연수를 입력하세요.");
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        print_square(number);
    }
}

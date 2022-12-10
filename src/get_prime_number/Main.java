package get_prime_number;

import java.util.Scanner;

public class Main {

    /**
     * 입력받은 수가 소수인지 판별해주는 method
     * @param num 입력받은 수
     */
    static void getPrime(int num)
    {
        boolean isPrimeNumber = true;
        for(int i=2; i<=num/2; i++)
        {
            if(num%i == 0)
            {
                isPrimeNumber = false;
                break;
            }
        }
        printIsPrime(isPrimeNumber, num);
    }

    /**
     * 입력받은 수가 소수인지 아닌지 출력해주는 method
     * @param isPrime true면 소수, false면 소수가 아닌 boolean 변수
     * @param num 입력받은 수
     */
    static void printIsPrime(boolean isPrime, int num)
    {
        if (isPrime == true)
            System.out.println(num + "은 소수입니다.");
        else
            System.out.println(num + "은 소수가 아닙니다.");
    }

    public static void main(String[] args) {
        System.out.println("자연수를 입력하시오.");
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();

        getPrime(num);
    }
}

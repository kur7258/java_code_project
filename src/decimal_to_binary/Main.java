package decimal_to_binary;

import java.util.Scanner;

public class Main {

    /**
     * 입력된 10진수를 인수로 받아 2진수로 변환 후 출력하는 함수
     * @param number 입력된 10진수
     */
    static void decimalToBinary(int number)
    {
        int[] arrayOfBinary = new int[10]; //변환된 2진수를 저장할 배열

        int index=0;
        while(number>0)
        {
            arrayOfBinary[index] = number%2;
            number = number/2;
            index++;
        }

        System.out.print("정답: ");
        for (int i=(arrayOfBinary.length-1); i>=0; i--)
        {
            System.out.print(arrayOfBinary[i]);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("2진수로 변환할 10진수를 입력하세요.");
        int decimalNumber = scan.nextInt(); // 10진수 입력

        decimalToBinary(decimalNumber);
    }
}

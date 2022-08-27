package fibonacci;

import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        System.out.println("수열의 크기를 입력하세요");

        Scanner scan = new Scanner(System.in);
        int sizeOfFibonacci = Integer.parseInt(scan.next());

        int[] arrayOfFibonacci = new int[sizeOfFibonacci];


        for (int i=0; i<sizeOfFibonacci; i++)
        {
            //A1 = 1, A2 = 1
            if ((i == 0) || (i == 1))
            {
                arrayOfFibonacci[i] = 1;
            }
            // An = An-1 + An-2; n>=3
            else
            {
                arrayOfFibonacci[i] = arrayOfFibonacci[i-1] + arrayOfFibonacci[i-2];
            }
        }
        for(int i : arrayOfFibonacci)
        {
            System.out.print(i+" ");
        }
    }
}

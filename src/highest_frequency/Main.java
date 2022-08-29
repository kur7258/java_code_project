package highest_frequency;


import java.util.Arrays;

public class Main {

    /**
     * 초기 배열을 받아 빈도수를 정리한 후 배열에 저장해 반환하는 함수
     * @param arrayOfNumbers 초기 배열
     * @return 빈도수를 정리한 배열
     */
    int[] makeTheFrequencyArray(int[] arrayOfNumbers)
    {
        int[] saveNumbers = new int[10];

        for (int i =0; i<arrayOfNumbers.length; i++)
        {
            for (int j=1; j<=10;j++)
            {
                int tmp = j;
                if(arrayOfNumbers[i] == tmp)
                {
                    saveNumbers[j-1] ++;
                }
            }
        }
        return saveNumbers;
    }


    /**
     * 빈도수를 정리한 배열을 넘겨주면 최빈수가 무엇인지 출력해주는 함수
     * @param arrayOfFrequency 빈도수를 정리한 배열
     */
    void findTheMaxNumber(int[] arrayOfFrequency)
    {
        int max = 0;

        for (int i=0; i<arrayOfFrequency.length; i++) //최빈수의 횟수를 변수 max에 저장
        {
            if(max < arrayOfFrequency[i])
            {
                max = arrayOfFrequency[i];
            }
        }

        for (int j=0; j<arrayOfFrequency.length; j++) //정답 인덱스 찾아서 출력
        {
            if (max == arrayOfFrequency[j])
            {
                System.out.println("정답: " + (j+1) + " " + max + "회");
            }
        }
    }

    public static void main(String[] args) {
        Main main = new Main(); //내부 함수 호출을 위한 인스턴스 생성

        int[] arrayOfNumbers = {1,2,2,3,1,4,2,2,4,3,5,3,2}; //초기 배열

        main.findTheMaxNumber(main.makeTheFrequencyArray(arrayOfNumbers));
    }
}

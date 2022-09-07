package upper_to_small;

import java.util.Scanner;

public class Main {

    /**
     * 받아온 영문장의 대문자와 소문자를 변환해주는 method
     * @param input 입력받은 영문장
     */
    static void caseChange(String input) {~
        int askiTmp = 0; //aski 코드 임시 저장 변수
        int outputSentence = 0; //출력할 영문장

        for (int i = 0; i < input.length(); i++) {
            askiTmp = (int) input.charAt(i);

            if ((askiTmp >= 97) && (askiTmp <= 122)) //알파벳이 소문자일 경우
            {
                askiTmp = askiTmp - 32;  //대문자로 전환
            }
            else //알파벳이 대문자일 경우
            {
                askiTmp = askiTmp + 32; //소문자로 전환
            }

            outputSentence = askiTmp;
            System.out.print((char)outputSentence); 
        }
    }

    public static void main(String[] args) {
        System.out.println("영문장을 입력하세요.");
        Scanner scan = new Scanner(System.in);

        String inputSentence = scan.next();

        System.out.print("정답: ");
        caseChange(inputSentence);
    }
}

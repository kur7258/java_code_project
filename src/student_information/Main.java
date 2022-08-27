package student_information;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Student st1 = new Student("kim", "2017");
        Student st2 = new Student("v", "2018");
        Student st3 = new Student("rm", "2019");

        ArrayList<Student> arrayOfStudents = new ArrayList<Student>();

        arrayOfStudents.add(st1);
        arrayOfStudents.add(st2);
        arrayOfStudents.add(st3);

        Scanner scan = new Scanner(System.in);

        while (true)
        {
            System.out.println("계속 검색하려면 y, 종료하려면 n 입력");
            String input = scan.next();

            if (input.equals("y"))
            {
                System.out.println("검색을 시작합니다.");
                String inputStudentName = scan.next();
                boolean flag = false;

                for (Student stu: arrayOfStudents)
                {
                    if (stu.getName().equals(inputStudentName))
                    {
                        System.out.println("해당하는 학생의 학번은: "+stu.getNo());
                        flag = true;
                    }
                }
                if (!flag)
                {
                    System.out.println("해당하는 학생 이름이 없습니다.");
                }
            }
            else if (input.equals("n"))
            {
                break;
            }
        }
        System.out.println("검색을 종료합니다.");
    }
}

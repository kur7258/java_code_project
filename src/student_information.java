import java.util.ArrayList;
import java.util.Scanner;

/**
 * 학생들의 이름과 학번을 넘겨주면 학생 한 명의 정보가 저장되는 클래스
 */
class Student
{
    private String name;
    private String no;

    Student(String name, String no)
    {
        this.name = name;
        this.no = no;
    }

    void setName(String name) { this.name = name; }
    String getName() { return this.name; }

    void setNo(String no) { this.no = no; }
    String getNo() { return this.no; }
}

public class student_information {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Student> arrayOfStudents = new ArrayList<>();

        //학생 이름 저장
        arrayOfStudents.add(new Student("kim", "2017112531"));
        arrayOfStudents.add(new Student("v", "2018221563"));
        arrayOfStudents.add(new Student("rm", "2019225321"));

        //검색 flag 변수
        boolean searchTF = true;
        String inputStudentName;
        //학생 검색
        while(searchTF)
        {
            inputStudentName = scan.nextLine();

            for (Student student : arrayOfStudents)
            {
                if (inputStudentName == student.getName())
                {
                    System.out.println(student.getNo());
                }
                else
                {
                    System.out.println("없는 학생이름");
                }
            }
        }
    }
}

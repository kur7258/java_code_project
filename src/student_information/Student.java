package student_information;

/**
 * 학생들의 이름과 학번을 넘겨주면 학생 한 명의 정보가 저장되는 클래스
 */
public class Student
{
    private String name;
    private String no;

    Student(String name, String no)
    {
        super();
        this.name = name;
        this.no = no;
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return this.name; }

    public void setNo(String no) { this.no = no; }
    public String getNo() { return this.no; }
}

public class Student2 {

    public int studentNumber;
    public String studentName;
    public int grade;
    public Student2(){} //defalt 생성자

    //생성자
    public Student2(int studentNumber, String studentName, int grade){
        this.studentNumber = studentNumber;
        this.studentName = studentName;
        this.grade = grade;
    }

    public String showStudentInfo() {

        return studentName+ "학번은"+studentNumber+"학년은"+grade;
    }
}

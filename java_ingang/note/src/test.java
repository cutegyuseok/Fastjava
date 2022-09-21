public class test {
    public static void main(String[] args) {
        Student studentLee = new Student();
        studentLee.studentID = 12345;
        studentLee.studentName= "lee";
        studentLee.address = "강남구";
        studentLee.showStudentInfo();

        Student studentHyun = new Student();
        studentHyun.studentName = "Hyunjin";
        studentHyun.address = "용인";
        studentHyun.studentID = 10528;
        studentHyun.showStudentInfo();
    }
}

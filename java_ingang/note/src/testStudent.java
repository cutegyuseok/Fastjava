public class testStudent {

    public static void main(String[] args) {
        Student2 studentLee = new Student2(); //defalt 생성자
        System.out.println(studentLee.showStudentInfo());
        //생성자
        Student2 studentKim = new Student2(12345, "kim", 3);
        System.out.println(studentKim.showStudentInfo());
    }
}

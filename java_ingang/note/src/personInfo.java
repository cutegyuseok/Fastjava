public class personInfo {

    public double height;
    public double weight;
    public String name;
    public int age;
    public personInfo(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }
    public String showPerson() {
        return name+"씨는 "+age+"살 이고, 키와 몸무게는 "+height+"cm, "+weight+"kg 입니다.";
    }

}

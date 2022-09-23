public class Company {

    private static Company instace = new Company();
    private Company(){

    }
    public static Company getInstace(){
        if (instace == null){
            instace= new Company();
        }
        return instace;
    }
}

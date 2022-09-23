public class Employee {

    private static int serialNum = 1000;
    private int employeeId;
    private String employeeName;
    private String departmentl;
    public Employee(){
        serialNum++;
        employeeId = serialNum;

    }

    public static int getSerialNum() {
        return serialNum;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getDepartmentl() {
        return departmentl;
    }

    public void setDepartmentl(String departmentl) {
        this.departmentl = departmentl;
    }
}

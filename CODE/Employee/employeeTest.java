import Main.employee;

public class employeeTest {
    public static void main(String[] args) {
        employee emp = new employee(null,null,0.0);
        employee emp1 = new employee(null,null,0.0);
        System.out.println("Input info of employee no.1");
        emp.setEmployee();
        System.out.println("-------------");
        System.out.println("Input info of employee no.2");
        emp1.setEmployee();
        emp.getEmployee();
        emp1.getEmployee();
    }
}

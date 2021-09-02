package Main;
import java.util.Scanner;
public class employee{
    String firstName;
    String lastName;
    double monSalary;
    private Scanner inp;
    public employee (String firstName, String lastName, double monSalary)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.monSalary = monSalary;
    }
    public void setFirstName(String firstName)
    {
        inp = new Scanner (System.in);
        System.out.println ("First name: ");
        firstName = inp.nextLine();
        this.firstName=firstName;
    }
    public void setLastName(String lastName)
    {
        inp = new Scanner (System.in);
        System.out.println ("Last name: ");
        lastName = inp.nextLine();
        this.lastName=lastName;
    }
    public void setMonSalary(double monSalary)
    {
        inp = new Scanner (System.in);
        System.out.println ("Salary: ");
        monSalary = inp.nextDouble();
        if (monSalary <= 0.0)
            this.monSalary=0.0;
        else this.monSalary = monSalary;
    }
    public String getFirstName()
    {
        return this.firstName;
    }
    public String getLastName()
    {
        return this.lastName;
    }
    public double getMonSalary(double rate)
    {
        this.monSalary = this.monSalary * rate;
        return this.monSalary;
    }
    public void setEmployee()
    {
        setFirstName(this.firstName);
        setLastName(this.lastName);
        setMonSalary(this.monSalary);
    }
    public void getEmployee()
    {
        System.out.println("_________________");
        System.out.println("Full name: " + getFirstName() + " " + getLastName());
        System.out.println("Salary before raising: " + getMonSalary(1.0) * 12);
        System.out.println("Salary after raising: " + getMonSalary(1.1) * 12);
    }
}
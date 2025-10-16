import java.util.Scanner;
class EmployeeDetails{
    String name;
    int id;
    double salary;

}
public class Employee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How many empolyees do you want to enter");
        int limit = sc.nextInt();
        EmployeeDetails[] emp = new EmployeeDetails[limit];

        for (int i = 0; i < limit; i++) {
            emp[i] = new EmployeeDetails();
            System.out.println("Enter details for Employee " + (i + 1) + ":");

            System.out.print("ID: ");
            emp[i].id = sc.nextInt();
            sc.nextLine();

            System.out.print("Name: ");
            emp[i].name = sc.nextLine();


            System.out.print("Salary: ");
            emp[i].salary = sc.nextDouble();
            System.out.println();


        }
        System.out.println("Employee Details:");
        for (int i = 0; i < limit; i++) {
            System.out.println("ID: " + emp[i].id);
            System.out.println("Name: " + emp[i].name);
            System.out.println("Salary: " + emp[i].salary);
        }
    }
}


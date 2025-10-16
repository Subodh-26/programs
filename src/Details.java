import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Age: ");
        String age = sc.nextLine();
        System.out.print("Address: ");
        String address = sc.nextLine();
        System.out.println("YOUR DETAILS\n---------------------");
        System.out.println("Name: " + name +
                "\nAge: " + age +
                "\nAddress: " + address);

        sc.close();
    }
}

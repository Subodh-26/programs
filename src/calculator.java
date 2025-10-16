import java.util.Scanner;


public class calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
         int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        System.out.println("Choose operation: +  -  *  ");
        char operator = sc.next().charAt(0);

        int result = 0;

        switch (operator) {
            case '+':
                result = add(a, b);
                break;
            case '-':
                result = sub(a, b);
                break;
            case '*':
                result = multi(a, b);
                break;
            default:
                System.out.println("Invalid operator!");
                return;
        }
        System.out.println("Result: " + result);

    }
    public static int add(int a,int b){
        return a + b;
    }

    public static int sub(int a,int b){
        return a - b;
    }
    public static int multi(int a,int b){
        return a * b;
    }
}

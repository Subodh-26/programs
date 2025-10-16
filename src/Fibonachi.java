import java.util.Scanner;

public class Fibonachi {
    static int fibo(int n) {
        if (n <= 1){
            return n;
        }
            return fibo(n - 1) + fibo(n - 2);//5-1=4 and 5-2= 3
        //n=4 4-1 =3 and 4-2 = 2
        //n=3 3-1=2  and 3-2=1
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int terms = sc.nextInt();
        for (int i = 0; i < terms; i++) {
            System.out.print(fibo(i) + " ");
        }
       sc.close();
    }
}

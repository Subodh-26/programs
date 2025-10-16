public class ref {
    public static void main(String[] args) {
//        int a = 10;
//        int b = a;
//         b =20;
//        System.out.println(a);
//        System.out.println(b);

        int[] a = {1,2,3};
        int[] b = a;
        System.out.println(b[0]);
        b[0]=10;

        System.out.println(a[0]);
        System.out.println(b[0]);
    }

}

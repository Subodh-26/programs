public class Brk {
    public static void main(String[] args){
        int i = 1;
        while (i <= 10) {
            if (i == 3) {
                i++;
                continue;
            }
            System.out.println(i);
            if (i == 7) {
                break;
            }
            i++;
        }


    }
}

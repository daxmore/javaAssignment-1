public class q9 {
    public static void main(String[] args) {
        int num = 5;
        int fecto = 1;

        for (int i = 1; i <= num; i++) {
            fecto = fecto * i;
        }
        System.out.println("facatorial of " + num + " is " + fecto);
    }
}

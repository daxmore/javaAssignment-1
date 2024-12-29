public class q10 {
    public static void main(String[] args) {
        int a = 10, b = 20, c = 30;

        String result = (a > b && a > c) ? "A Is greater." : (b > a && b > c) ? "B Is greater." : "C Is greater.";
        System.out.println(result);
    }
}

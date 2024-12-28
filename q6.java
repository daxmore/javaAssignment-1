public class q6 {
    public static void main(String[] args) {
        int a = 10, b = 20;
        System.out.println("before swap: " + a + " " + b);

        a = a ^ b;
        b = a ^ b;
        a = a ^ b;

        System.out.println("after swap: " + a + " " + b);
    }
}

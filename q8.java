public class q8 {
    public static void main(String[] args) {
        int num = 0;

        if (num <= 1 || num == 0) {
            System.out.println("number Should be greater than 0 and 1.");
        }

        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                System.out.println(num + " is not prime");
                return;
            }
        }
        System.out.println(num + " is prime");
    }
}

public class q11 {
    public static int febonacci(int num) {
        if (num == 0)
            return 0;
        if (num == 1)
            return 1;
        return (febonacci(num - 2) + febonacci(num - 1));
    }

    public static void main(String[] args) {
        System.out.println("febonacci number is: " + febonacci(15));
    }
}

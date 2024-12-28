import java.util.Scanner;

public class q2 {
    public static void withoutScanner() {
        int a, b;
        a = 10;
        b = 20;

        System.out.println("the addition without Scanner: " + (a + b));
    }

    public static void withScanner() {
        int x, y;
        System.out.println("enter the number: ");

        Scanner s = new Scanner(System.in);
        
        x = s.nextInt();
        y = s.nextInt();
        System.out.println("the addition with Scanner: " + (x + y));

        s.close();
    }

    public static void main(String[] args) {
        withoutScanner();
        withScanner();
    }
}

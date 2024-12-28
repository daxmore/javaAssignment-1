import java.util.Scanner;

public class q7 {
    public static void main(String[] a) {
        char ch;

        System.out.println("enter the character: ");
        Scanner s = new Scanner(System.in);

        ch = s.next().charAt(0);
        if (ch == 'A' || ch == 'E' || ch == 'O' || ch == 'U' || ch == 'I' || ch == 'a' || ch == 'e' || ch == 'o'
                || ch == 'u' || ch == 'i') {
            System.out.println("Vowel");
        } else {
            System.out.println("Constant");
        }
        s.close();
    }
}

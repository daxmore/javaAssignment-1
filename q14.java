public class q14 {
    public static void main(String[] args) {
        int[] marks = new int[3];

        marks = new int[] { 15, 85, 62 };
        int[] arr = new int[3];
        arr = marks;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}

public class oddeve {

    public static void printOddEven(int n) {
        // Print even numbers
        int num = 0;
        while (num < n) {
            System.out.println(num + " is Even");
            num += 2;
        }

        // Print odd numbers
        num = 1;
        while (num < n) {
            System.out.println(num + " is Odd");
            num += 2;
        }
    }

    public static void main(String[] args) {
        int limit = 10; // Set your limit here
        printOddEven(limit);
    }
}

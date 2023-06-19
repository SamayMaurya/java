import java.util.Arrays;
import java.util.Scanner;

class SortString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string:");
        String str = scanner.nextLine();

        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);

        String sortedStr = new String(charArray);
        System.out.println("Sorted string: " + sortedStr);
    }
}

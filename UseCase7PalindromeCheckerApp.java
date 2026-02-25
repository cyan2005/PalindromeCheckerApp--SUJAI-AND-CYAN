import java.util.*;

public class UseCase7PalindromeCheckerApp {

    public static void main(String[] args) {

        System.out.println("UC7: Deque Palindrome Checker");

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter word: ");
        String input = sc.nextLine();

        Deque<Character> deque = new ArrayDeque<>();

        for (char c : input.toCharArray()) {
            deque.addLast(c);
        }

        boolean isPalindrome = true;

        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                isPalindrome = false;
                break;
            }
        }

        System.out.println(isPalindrome ? "Palindrome" : "Not Palindrome");

        sc.close();
    }
}
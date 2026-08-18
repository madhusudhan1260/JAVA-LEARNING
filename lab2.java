import java.util.Scanner;

public class lab2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        String feedback;

        while (true) {
            System.out.print("Enter Feedback Message: ");
            feedback = sc.nextLine();

            if (feedback.isEmpty()) {
                System.out.println("Feedback message cannot be empty.");
            } 
            else if (feedback.length() > 500) {
                System.out.println("Feedback cannot exceed 500 characters.");
            } 
            else {
                break;
            }
        }

        System.out.print("Enter Keyword to Search: ");
        String keyword = sc.nextLine();

        int characterCount = feedback.length();

        String trimmedFeedback = feedback.trim();

        int wordCount = 0;

        if (!trimmedFeedback.isEmpty()) {
            wordCount = trimmedFeedback.split("\\s+").length;
        }

        String lowerFeedback = feedback.toLowerCase();
        String lowerKeyword = keyword.toLowerCase();

        int occurrenceCount = 0;
        int index = 0;

        while ((index = lowerFeedback.indexOf(lowerKeyword, index)) != -1) {
            occurrenceCount++;
            index += lowerKeyword.length();
        }

        System.out.println("\n----- CUSTOMER FEEDBACK DETAILS -----");

        System.out.println("Customer Name       : " + name);
        System.out.println("Feedback Message    : " + feedback);
        System.out.println("Character Count     : " + characterCount);
        System.out.println("Word Count          : " + wordCount);
        System.out.println("Keyword             : " + keyword);
        System.out.println("Keyword Occurrences : " + occurrenceCount);

        if (occurrenceCount > 0) {
            System.out.println("Keyword Found       : Yes");
        } else {
            System.out.println("Keyword Found       : No");
        }

        sc.close();
    }
}
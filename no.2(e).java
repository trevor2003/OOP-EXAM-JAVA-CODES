import java.util.Scanner;

public class BookDescription {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a book description: ");
        String description = scanner.nextLine();
        
        // Count occurrences of "Uganda"
        int count = countOccurrences(description, "Uganda");
        
        System.out.println("The word 'Uganda' appears " + count + " times.");
    }
    
    public static int countOccurrences(String text, String word) {
        // Ignore case
        String lowerText = text.toLowerCase();
        String lowerWord = word.toLowerCase();
        int count = 0;
        
        // Split the text into words and count matches
        String[] words = lowerText.split("\\W+"); // Split by non-word characters
        for (String w : words) {
            if (w.equals(lowerWord)) {
                count++;
            }
        }
        
        return count;
    }
}

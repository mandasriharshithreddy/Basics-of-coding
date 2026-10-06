public class countwords {
    public static void main(String[] args) {
        String text = "This is a sample text with several words.";
        String[] words = text.split("\\s+");
        int wordCount = words.length;
        System.out.println("Number of words: " + wordCount);
    }
}
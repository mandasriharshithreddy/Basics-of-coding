public class reversewords {
    public static void main(String[] args) {
        String text = "This is a sample text with several words.";
        String[] words = text.split("\\s+");
        for(int i=0; i<words.length; i++) {
            String word = words[i];
            for(int j=word.length()-1; j>=0; j--) {
                System.out.print(word.charAt(j));
            }
            if(i < words.length - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();

    }
    
}

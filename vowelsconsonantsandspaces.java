public class vowelsconsonantsandspaces {
    public static void main(String[] args) {
        String text = "This is a sample text with several words.";
        text = text.toLowerCase(); // Convert to lowercase for easier comparison
        int vowelCount = 0;
        int consonantCount = 0;
        int spaceCount = 0;

        for(int i=0; i<text.length(); i++) {
            char ch = text.charAt(i);
            if(ch == ' ') {
                spaceCount++;
            } else if(ch >= 'a' && ch <= 'z' ) {
                if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
                    vowelCount++;
                } else {
                    consonantCount++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowelCount);
        System.out.println("Number of consonants: " + consonantCount);
        System.out.println("Number of spaces: " + spaceCount);
    }
    
}

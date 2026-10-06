public class removespaces {
    public static void main(String[] args) {
        String str = "My name is Harshith";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            char lower = Character.toLowerCase(ch);

            if (lower != ' ') {
                result.append(ch);
            }
        }

        System.out.println("Without spaces: " + result);
    }   
}

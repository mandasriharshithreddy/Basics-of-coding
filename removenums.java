public class removenums {
    public static void main(String[] args) {

        String str = "Hello@123 World!";

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);

            if ((ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') || (ch == ' ')) {

                result.append(ch);
            }
        }

        System.out.println(result);
    }
}

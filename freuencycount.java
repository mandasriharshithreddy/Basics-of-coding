public class freuencycount {
     public static void main(String[] args) {
        int count = 0;
        String str = "harshith";
        char target = 'h';

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i) == target){
                count+=1;
            }
        }
        System.out.println(target + " occurs " + count + " times in the string.");

    }
}

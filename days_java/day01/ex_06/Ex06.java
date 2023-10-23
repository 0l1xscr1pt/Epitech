public class Ex06 {
    public static void main(String[] args) {
        sequence(5);
    }

    public static void sequence(int number) {
        String current = "1";
        System.out.println(current);

        for (int i = 1; i < number; i++) {
            current = countAndSay(current);
            System.out.println(current);
        }
    }

    public static String countAndSay(String s) {
        String result = "";
        int count = 1;

        for (int i = 0; i < s.length(); i++) {
            if (i + 1 < s.length() && s.charAt(i) == s.charAt(i + 1)) {
                count++;
            } else {
                result += count + s.charAt(i);
                count = 1;
            }
        }

        return result;
    }
}
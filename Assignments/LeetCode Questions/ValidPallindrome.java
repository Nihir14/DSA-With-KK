public class ValidPallindrome {
    public static void main(String[] args) {
        String s = "NIHIR";
        System.out.println(isPalindrome(s));

    }
    public static boolean isPalindrome(String s) {
        s.toLowerCase();
        System.out.println(s);
        StringBuilder sb = new StringBuilder();
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57 || s.charAt(i) <= 122 && s.charAt(i) >= 97) {
                sb.append(s.charAt(i));
            }
        }
        System.out.println(sb.toString());
        System.out.println(sb.reverse().toString());
        System.out.println(sb.toString());
        String dup = sb.reverse().toString();
        if (dup.equals(sb.toString())) {
            return true;
        }
        return false;
    }
}

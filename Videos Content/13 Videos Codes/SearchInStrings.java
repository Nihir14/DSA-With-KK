public class SearchInStrings {
    public static void main(String[] args) {
        String str = "Nihir Verma";
        char target = 'i';
        System.out.println(strSearch(str, target));

    }
    static boolean strSearch(String str, char target) {
        if (str.isEmpty()) {
            return false;
        }
        for (char ch : str.toCharArray()) {
            if (target == ch) {
                return true;
            }
        }

        return false;
    }
}

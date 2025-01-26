public class SentenceSorting {
    public static void main(String[] args) {
        System.out.println(sortSentence("a3 sentence4 This1 is2"));

    }
    static public String sortSentence(String s) {
        StringBuilder sb = new StringBuilder("");
        String[] ans = new String[9];
        int index = 0;
        StringBuilder temp = new StringBuilder("");
        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i) == 32) {
                continue;
            }
            if (s.charAt(i) >= 48 && s.charAt(i) <= 57) {
                index = (s.charAt(i)) - '0';
                ans[index-1] = temp.toString();
                temp.setLength(0);
            } else {
                temp.append(s.charAt(i));
            }

        }
        for (int i=0; i<ans.length; i++) {
            if (ans[i] == null) {
                continue;
            }
            sb.append(ans[i] + " ");
        }
        return sb.toString();
    }
}

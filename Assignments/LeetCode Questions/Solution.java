class DetectCapital {
    public boolean detectCapitalUse(String word) {
        if (word.length() == 0 || word.length() == 1) {
            return true;
        }
        if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
            boolean capital = false;
            if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
                capital = true;
            }
            boolean capital1 = false;
            for (int i = 2; i < word.length(); i++) {
                if (word.charAt(1) >= 'A' && word.charAt(1) <= 'Z') {
                    capital1 = true;
                }
            }
            if (capital != capital1) {
                return false;
            }
        } else {
            for (int i = 1; i < word.length(); i++) {
                if (word.charAt(0) >= 'A' && word.charAt(0) <= 'Z') {
                    return false;
                }
            }
        }
        return true;
}      
}
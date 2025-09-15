class PalindromeChecker {
    String text;

    PalindromeChecker(String t) {
        text = t;
    }

    boolean isPalindrome() {
        String reversed = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reversed);
    }

    void displayResult() {
        if (isPalindrome()) System.out.println(text + " is a palindrome");
        else System.out.println(text + " is not a palindrome");
    }

    public static void main(String[] args) {
        PalindromeChecker p = new PalindromeChecker("madam");
        p.displayResult();
    }
}


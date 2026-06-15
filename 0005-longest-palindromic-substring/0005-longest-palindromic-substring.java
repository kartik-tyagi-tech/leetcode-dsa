class Solution {
    public String longestPalindrome(String s) {

        if (s.length() <= 1)
            return s;

        String palindrome = "";
        for (int i = 0; i < s.length(); i++) {
            int left = i;
            int right = i;

            while (s.charAt(left) == s.charAt(right)) {
                left--;
                right++;

                if (left == -1 || right >= s.length())
                    break;

            }
            if (palindrome.length() < s.substring(left + 1, right).length()) {
                palindrome = s.substring(left + 1, right);
            }

            left = i - 1;
            right = i;

            while ((left > -1 && right < s.length()) && s.charAt(left) == s.charAt(right)) {


                left--;
                right++;

            }
            if (palindrome.length() < s.substring(left + 1, right).length()) {
                palindrome = s.substring(left + 1, right);
            }
        }
        return palindrome;
    }
}
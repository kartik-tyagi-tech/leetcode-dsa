class Solution {
    public int lengthOfLongestSubstring(String s) {
        ArrayList<Character> list = new ArrayList<>();
        int left = 0;
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if (!(list.contains(s.charAt(right))))
                list.add(s.charAt(right));
            else {
                while (left<=right && s.charAt(left) != s.charAt(right)) {
                    list.remove((Character)s.charAt(left));
                    left++;
                }
                left++;
            }
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }
}
class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int left = 0;
        int maxCount = 0;
        int maxLength = 0;

        for (int right = 0; right < s.length(); right++) {
            // update frequency
            count[s.charAt(right) - 'A']++;
            
            // track the most frequent character in window
            maxCount = Math.max(maxCount, count[s.charAt(right) - 'A']);
            
            // if replacements needed > k, shrink window
            while ((right - left + 1) - maxCount > k) {
                count[s.charAt(left) - 'A']--;
                left++;
            }
            
            // update result
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }
}
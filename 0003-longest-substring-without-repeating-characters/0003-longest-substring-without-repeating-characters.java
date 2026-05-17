class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int maxLength = 0;
        int left = 0;
        int right = 0;

        while (left <= right && right < s.length()) {
            if (!map.containsKey(s.charAt(right))) {
                map.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;
            } else {
                if(left<=map.get(s.charAt(right)))  left = map.get(s.charAt(right)) + 1;
                
                map.put(s.charAt(right), right);
                maxLength = Math.max(maxLength, right - left + 1);
                right++;

                        
            }
        }
        return maxLength;

    }
}
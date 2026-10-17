class Solution {
	public String minWindow(String s, String t) {
		if(t.length()>s.length()) return "";
		int freq[] = new int[128];
		for (int i = 0; i < t.length(); i++) {
			char ch = t.charAt(i);
			freq[ch]++;
		}
		int left = 0;
		int formed = 0;
		int minLength = Integer.MAX_VALUE;
		int start = 0;
		for (int right = 0; right < s.length(); right++) {
			char ch = s.charAt(right);
			if (freq[ch] > 0) {
				formed++;
			}
			freq[ch]--;
			while (formed == t.length()) {
				if (right - left + 1 < minLength) {
    minLength = right - left + 1;
    start = left;
}
				char c = s.charAt(left);
				freq[c]++;
                
				if (freq[c] > 0) {
					formed--;
				}
				left++;
			}
		}
		if(minLength==Integer.MAX_VALUE) return "";
		return s.substring(start, start + minLength);
	}
}

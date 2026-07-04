class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            char key = s.charAt(i);
            char value = t.charAt(i);

            if (map.containsKey(key)) {
                if (map.get(key) != value)
                    return false;
            } else {
                if (used.contains(value))
                    return false;

                map.put(key, value);
                used.add(value);
            }
        }

        return true;
    }
}
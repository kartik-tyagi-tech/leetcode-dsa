class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> map = new HashMap<>();
        for(char ch:ransomNote.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        for(char ch:magazine.toCharArray()){
            if(!map.containsKey(ch)) continue;
            else {
                map.put(ch,map.get(ch)-1);
            }
        }
        for(char ch:ransomNote.toCharArray()){
            if(map.get(ch)>0) return false;
        }
        return true;
    }
}
class Solution {
    
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()) return false;
        int frequency[]=new int [26];

        for(int i=0;i<s.length();i++){
            frequency[s.charAt(i)-'a']++;
            frequency[t.charAt(i)-'a']--;
        }
               for(int each:frequency){
                if(each!=0){
                    return false;
                }
               }
               return true;
    }


    public ArrayList<String> anagrams(String p,String [] strs){
        ArrayList<String> list = new ArrayList<>();
        for(String each:strs){
            
            if(isAnagram(each,p)){
                 list.add(each);
            }
        }
        return list;
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        if(strs.length<=1) return new ArrayList<>(Arrays.asList(Arrays.asList(strs)));
        HashSet<List<String>> set = new HashSet<>();
        
              for(String each:strs){
                set.add(anagrams(each,strs));
              }

        List<List<String>> list = new ArrayList<>(set);
        return list;
    }
}
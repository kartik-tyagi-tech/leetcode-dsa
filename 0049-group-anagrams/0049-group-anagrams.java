class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> map =new HashMap<>();
        for(String each : strs){
            char arr[]=each.toCharArray();
            Arrays.sort(arr);
            String newSt=new String(arr);
            if(!map.containsKey(newSt)){
                map.put(newSt,new ArrayList<>());
            }
            
                map.get(newSt).add(each);
        }
         return new ArrayList<>(map.values());
    }
   
}
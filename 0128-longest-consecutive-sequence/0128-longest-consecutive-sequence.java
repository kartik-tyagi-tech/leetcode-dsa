class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet <Integer>set= new HashSet<>();
        for(int each:nums){
            set.add(each);
        }
        int longest=0;
        int streak=0;
        for (int each: set){
            if(!set.contains(each-1)){
                      streak=1;
                      while(set.contains(each+1)){
                        streak++;
                        each++;
                      }
            }
            longest=Math.max(longest,streak);
        }
        return longest;
    }
}
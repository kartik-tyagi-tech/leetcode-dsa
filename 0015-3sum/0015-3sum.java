class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
       HashSet<List<Integer>> set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();

        for(int i =0;i<nums.length;i++){
            map.put(nums[i],i);
        }
         
        for(int i =0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                int needed = nums[i]+nums[j]-2*(nums[i]+nums[j]);
                if(map.containsKey(needed) && map.get(needed)!=i && map.get(needed)!=j){
                         List<Integer> temp =Arrays.asList(nums[i],nums[j],needed);
                         Collections.sort(temp);
                         set.add(temp);
                }
            }
        }
        
        
        return new ArrayList<>(set);
    } 
}
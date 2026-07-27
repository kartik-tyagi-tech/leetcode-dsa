class Solution {
    public int subarraySum(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer>map=new HashMap<>();
        int sum =0;
        int count=0;
        for(int i =0;i<n;i++){
               sum+=nums[i];
               int needed = sum-k;
               if(sum==k) count++;
               if(map.containsKey(needed)) count=count+map.get(needed);
               map.put(sum,map.getOrDefault(sum,0)+1);
               
        }
        return count;
    }
}
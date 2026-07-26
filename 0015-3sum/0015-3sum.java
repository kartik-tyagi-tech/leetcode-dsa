class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;

        HashSet<Integer>set=new HashSet<>();
        HashSet<List<Integer>> check = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();

        for(int i =0;i<n;i++){
            int j = i+1;
            while(j<n){
                int needed = -(nums[i]+nums[j]);
                         if(set.contains(needed)) {
                ArrayList<Integer> list = new ArrayList<>();
                   list.add(nums[i]);
                list.add(nums[j]);
                  list.add(needed);
                Collections.sort(list);
                check.add(list);
                j++;
            }else {
                set.add(nums[j]);
                j++;
            }
             } 
             set.clear();
        }
        for(List each:check){
            result.add(each);
        }
        return result;
    }
}
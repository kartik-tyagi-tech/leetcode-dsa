class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min=Integer.MAX_VALUE;
        int max=Integer.MIN_VALUE;
        
        List<Integer>list=new ArrayList<>();
        List<Integer>result=new ArrayList<>();

        for(int each:nums){
             min=Math.min(min,each);
             max=Math.max(max,each);
             list.add(each);
        }
        for(int i=min;i<=max;i++){
                if(!list.contains(i)) result.add((Integer) i);
        }
        return result;
    }
}
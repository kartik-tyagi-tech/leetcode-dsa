class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        int n = nums.length;
        int i =0;
        while(i<n-2){
            int j = i+1;
            int k = n-1;
            while(j<k){
                int value = nums[i] + nums[j] + nums[k];
                if(value==0) {
                    ArrayList<Integer>list=new ArrayList<>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    
                    int temp2=nums[j];
                    int temp3=nums[k];
                    while(j<k && nums[j]==temp2){
                        j++;
                    }
                    while(k>j && nums[k]==temp3){
                        k--;
                    }
                }
                if(value<0){
                    int temp2=nums[j];
                    while(j<k && nums[j]==temp2){
                        j++;
                    }
                } 
                if(value>0){
                    int temp2=nums[j];
                    int temp3=nums[k];
                    while(k>j && nums[k]==temp3){
                        k--;
                    }
                } 
            } 
            int temp1=nums[i];
            while(i<n-2 && nums[i]==temp1){
                i++;
            }
        }
        return result;
    }
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
//         brute force approach : o(n^2),o(1)
//         class Solution {
//     public int[] twoSum(int[] nums, int target) {
//         int []arr=new int[2];

//         for(int i=0;i<nums.length;i++){
//                 int value=target-nums[i];
//                 for(int j=i+1;j<nums.length;j++){
//                     if(nums[j]==value){
//                         arr[0]=i;
//                         arr[1]=j; 
//                 }
//             }
//         }
//         return arr;
//     }
// }
   HashMap<Integer,Integer> map=new HashMap<>();

   for(int i=0;i<nums.length;i++){
    int diff=target-nums[i];
    if(map.containsKey(diff)){
           return new int[] {map.get(diff),i};
   }
   map.put(nums[i],i);

    }
    return new int[] {};
}
}
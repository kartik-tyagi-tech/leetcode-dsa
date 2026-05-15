class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        char arr[]=s.toCharArray();

        int low=0;
        int high=arr.length-1;
        while(low<high){
            while(low<high && !(Character.isLetterOrDigit(arr[low]))) low++;

            while(low<high && !( Character.isLetterOrDigit(arr[high]))) high--;

            if(arr[low]!=arr[high]){
                return false;
            }
               low++;
               high--;
        }
        return true;
    }
}
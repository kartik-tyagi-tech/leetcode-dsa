class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int count =0;
        for (String each:patterns){
            if (word.contains(each)) count++;
        }
        return count;
    }
}
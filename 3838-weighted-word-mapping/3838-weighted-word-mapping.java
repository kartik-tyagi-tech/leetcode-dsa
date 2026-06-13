class Solution {
    public String mapWordWeights(String[] words, int[] weights) {
        String result="";
        for(String s:words){
            int sum=0;
            for(int i =0;i<s.length();i++){
                sum+=weights[s.charAt(i)-'a'];
            }
            sum=sum%26;
            int ascii='z'-sum;
            result+=(char) ascii;
        }
        return result;
    }
}
class Solution {
    public String mergeAlternately(String word1, String word2) {
        int l1=word1.length();
        int l2=word2.length();
        int minLength=Math.min(l1,l2);
        String result="";

        for(int i =0;i<2*minLength;i++){
                if(i%2==0) result+=word1.charAt(i/2);
                else result+=word2.charAt(i/2);
        }
        if(minLength<l1){
            for(int i=minLength;i<l1;i++){

                result+=word1.charAt(i);
            }
        }
        else{
            for(int i=minLength;i<l2;i++){

                result+=word2.charAt(i);
            }
        }
        return result;
    }
}
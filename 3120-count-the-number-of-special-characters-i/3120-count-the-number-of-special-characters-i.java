class Solution {
    public int numberOfSpecialChars(String word) {
        ArrayList<Character> list = new ArrayList<>();
        boolean arr[]=new boolean[26];
        int count =0;
        int l =word.length();
        for(int i =0;i<l;i++){
            list.add(word.charAt(i));
        }

        for (int i =0;i<l;i++){
            if(Character.isLowerCase(word.charAt(i))  && list.contains((char)(word.charAt(i)-32)) && arr[word.charAt(i)-97]==false) {
                count ++;
                arr[word.charAt(i)-97]=true;
            }
        }
        return count;
    }
}
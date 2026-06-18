class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> st = new Stack<>();
        char last=s.charAt(0);
        st.push(s.charAt(0));
        StringBuilder snew=new StringBuilder();
        snew.append(last);
    
        for(int i =1;i<s.length();i++){
            char ch=s.charAt(i);

            if(ch==last && !st.isEmpty()){
                st.pop();
                snew.deleteCharAt(snew.length()-1);
            }
            else {
                st.push(ch);
                snew.append(ch);
            }
            if(!st.isEmpty()) last=st.peek();
            
        }
        return snew.toString();
    }
}
class Solution {
    public boolean isValid(String s) {
        Stack<Character>st= new Stack<>();

        if(s.length()<2) return false;

        for(int i =0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='{' || ch=='(' || ch=='['){
                st.push(ch);
            }
            else if (st.size()>0){
                if(((ch=='}' && st.peek()=='{') || (ch==']' && st.peek()=='[') || (ch==')' && st.peek()=='(')) && st.size()>0){
                    st.pop();
                } else return false;
            }
            else if ((ch=='}' || ch==')' || ch==']')){
                       return false;
            }
        }
        return st.isEmpty();
    }
}
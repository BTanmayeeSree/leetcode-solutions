class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st= new Stack<>();
        int ad=0;
        for(char c:s.toCharArray()){
            if(c=='(')
            st.push(c);
            else {
                if(!st.isEmpty()){
                    st.pop();
                }
                else{
                    ad++;
                }
            }
        }
        return ad+st.size();
    }
}
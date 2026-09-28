class Solution {
    public int maxDepth(String s) {
        int depth=0;
        int maxdep=0;
        for(char c:s.toCharArray()){
            if(c=='(')
            depth++;
            maxdep=Math.max(maxdep,depth);
            if(c==')')
            depth--;
        }
        return maxdep;
    }
}
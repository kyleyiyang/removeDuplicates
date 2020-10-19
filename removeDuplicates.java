class Solution {
    public String removeDuplicates(String S) {
        int i=0;
        while (i<S.length()-1) {
            if (S.charAt(i+1)==S.charAt(i)) {
                S = S.substring(0, i) + S.substring(i+2);
                i=0;
            } else {
                i++;
            }
        }
        return S;
    }
}

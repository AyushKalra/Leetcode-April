class Solution {
    public String removeDuplicates(String S, int K) {
       for (int i = 1, count = 1; i < S.length(); i++) {
            count = S.charAt(i) == S.charAt(i-1) ? count + 1 : 1;
            if (count == K) 
                S = removeDuplicates(S.substring(0, i-K+1) + S.substring(i+1), K);
        }
        return S;
    }
}
class Solution {
    String vowels = "aeiouAEIOU";
    
    public boolean halvesAreAlike(String S) {
        
        int mid = S.length() / 2, val = 0;
        
        for (int i = 0, j = mid; i < mid; i++, j++) {
            if (vowels.indexOf(S.charAt(i)) >= 0)
                val++;
            if (vowels.indexOf(S.charAt(j)) >= 0)
                val--;
        }
        return val == 0;
    }
}
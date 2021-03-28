class Solution {
    public String originalDigits(String s) {
       int[] chars = new int[26];
        for(char c: s.toCharArray()){
            chars[c - 'a']++;
        }
        
        
        int[] digits = new int[10];
        digits[0] = chars['z' - 'a'];
        digits[6] = chars['x' - 'a'];
        digits[4] = chars['u' - 'a'];
        digits[2] = chars['w' - 'a'];
        digits[8] = chars['g' - 'a'];
        digits[5] = chars['f' - 'a'] - digits[4];
        digits[7] = chars['s' - 'a'] - digits[6];
        digits[3] = chars['t' - 'a'] - digits[2] - digits[8];
        digits[1] = chars['o' - 'a'] - digits[2] - digits[4] - digits[0];;
        digits[9] = chars['i' - 'a'] - digits[5] - digits[6] - digits[8];
 
        
       StringBuilder ans=new StringBuilder();
        
        
        for(int i = 0; i < 10; i++){
           while(digits[i]!=0 && digits[i]--!=0)
                ans.append(i);
               
            
        }
        return ans.toString();
      
    }
}
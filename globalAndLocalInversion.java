class Solution {
    public boolean isIdealPermutation(int[] A) {
        int n= A.length;
        int g=0; 
        int local = 0;
        for (int i =1 ; i< n ; i++ ) { 
            if( A[i] < A[i-1])                   
                local += 1;
            if (A[i] < i){                      
               int diff = i - A[i]  ;               
                g += Math. floor ( diff * (diff+1) / 2) ;
                    }
            
        
        }
        return g == local;
    }
}
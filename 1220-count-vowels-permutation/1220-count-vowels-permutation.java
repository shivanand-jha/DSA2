class Solution {
    public int countVowelPermutation(int n) {
        int mod = 1000_000_007;
        long[][] dp = new long[n + 1][5]; 
        long a = 1;
        long e = 1;
        long i = 1;
        long o = 1;
        long u = 1;
        
        for (int k = 1; k < n; k++) {
            long aa = a;
            long ee = e;
            long ii = i;
            long oo = o;
            long uu = u;
            a = (ee + ii + uu) % mod ;
            e = (aa + ii) % mod;
            i = (ee + oo) % mod;
            o = ii % mod;
            u = (ii + oo) % mod;
        }
        
        long res = ((((a + e) % mod + i) % mod + o) % mod + u) % mod; 
        return (int) res;
    }
}
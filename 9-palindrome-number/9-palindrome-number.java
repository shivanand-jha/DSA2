class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0 || (x%10==0 && x != 0)) {
            return false;
        }
        int revNu = 0;
        while(x > revNu)
        {
            revNu = revNu*10 + x % 10;
            x = x/10; 
        }
        return x == revNu || x == revNu/10;
    }
}
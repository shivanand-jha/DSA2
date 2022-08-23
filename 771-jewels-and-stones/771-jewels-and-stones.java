class Solution {
    public int numJewelsInStones(String j, String s) {
        int res=0; 
        for(char c : j.toCharArray())
        {
            for(char d :s.toCharArray())
            {
                if(c==d)
                {
                    res++;
                }
            }
        }
        return res;
    }
}
class Solution {
    public List<List<Integer>> generate(int r) {
        List<List<Integer>> al = new ArrayList<List<Integer>>();
        List<Integer> l=new ArrayList<Integer>();
        for(int i=0; i<r; i++)
        {
            l.add(0,1);
            for(int j=1; j<l.size()-1; j++)
                l.set(j,l.get(j)+l.get(j+1));
                al.add(new ArrayList<Integer>(l));
        }
        
        return al;
    }
}
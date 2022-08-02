class Solution {
    public int kthSmallest(int[][] m, int k) {
       List<Integer> l= new ArrayList<>();
       for(int[] a: m)
       {
           for(int b:a)
           {
               l.add(b);
           }
           
       }
        int[] c=new int[l.size()];
        for(int i=0; i<c.length; i++)
        {
            c[i]=l.get(i);
        }
        Arrays.sort(c);
        return c[k-1];
    }
}
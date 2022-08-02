class Solution {
    public int kthSmallest(int[][] m, int k) {
        int[] a= new int[m.length*m.length];
        int x=0;
      for (int i = 0; i < m[0].length; i++) {
            for (int j = 0; j <m.length ; j++) {
                
                a[x++]=m[i][j];
            }
        }
        Arrays.sort(a);
        return a[k-1];
    }
}
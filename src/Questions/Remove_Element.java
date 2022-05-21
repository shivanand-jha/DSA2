package Questions;

public class Remove_Element {
        public  static int removeElement(int[] nums, int val) {
            int i = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != val) {
                    nums[i] = nums[j];
                    i++;
                }
            }
            return i;
        }

    public static void main(String[] args) {
        int[] nums= {1,2,3,2,4,3,5,2};
        removeElement(nums,3);
        for (int a :
                nums) {
            System.out.print(a+" ");
        }
    }
}

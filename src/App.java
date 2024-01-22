
public class App {
    public static void main(String[] args) throws Exception {
        removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2);
    }

    public static int removeElement(int[] nums, int val) {
        int j = 0; // Slow pointer

        // Fast pointer
        for (final int num : nums) {
            if (num != val) {
                nums[j++] = num;
            }
        }

        // Fast pointer
        // for (int i = 0; i < nums.length; i++) {
        // if (nums[i] != val) {
        // nums[j] = nums[i];
        // j++;
        // }
        // }
        return j;
    }

}

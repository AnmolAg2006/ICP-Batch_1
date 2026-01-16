import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum_04 {
    public static void main(String[] args) {
        
        int nums[]={-1,0,1,2,-1,-4};
        System.out.println(threeSum(nums));
    }
     public static List<List<Integer>> threeSum(int[] nums) {

        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 2; i++) {
            // Skip duplicate values for the first element
            if (i > 0 && nums[i] == nums[i - 1])
                continue;

            // Two pointers
            int lo = i + 1;
            int hi = nums.length - 1;

            // Find pairs such that nums[i] + nums[lo] + nums[hi] == 0
            while (lo < hi) {

                int total = nums[i] + nums[lo] + nums[hi];

                if (total == 0) {

                    // Valid triplet found
                    ans.add(Arrays.asList(nums[i], nums[lo], nums[hi]));

                    lo++;
                    hi--;

                    // Skip duplicate values for lo
                    while (lo < hi && nums[lo] == nums[lo - 1]) {
                        lo++;
                    }

                    // Skip duplicate values for hi
                    while (lo < hi && nums[hi] == nums[hi + 1]) {
                        hi--;
                    }

                } else if (total < 0) {
                    // Need a larger sum
                    lo++;
                } else {
                    // Need a smaller sum
                    hi--;
                }
            }
        }
        return ans;
    }
}

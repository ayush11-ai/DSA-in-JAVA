import java.util.HashSet;

class Solution {

    public boolean containsDuplicate(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            if (set.contains(nums[i])) {
                return true;
            }

            set.add(nums[i]);
        }

        return false;
    }

    public static void main(String[] args) {

        int[] nums = {1, 2, 3, 4, 1};

        Solution obj = new Solution();

        System.out.println(obj.containsDuplicate(nums));

    }
}
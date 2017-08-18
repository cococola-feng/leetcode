package set.a21;

import java.util.TreeSet;

public class Solution220_SE {
	public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {
        if (nums == null || nums.length == 0 || k <= 0) {
            return false;
        }

        final TreeSet<Long> values = new TreeSet<>();
        for (int i = 0; i < nums.length; i++) {

            final Long floor = values.floor((long)nums[i] + (long)t);
            final Long ceil = values.ceiling((long)nums[i] - (long)t);
            if ((floor != null && floor >= nums[i])
                    || (ceil != null && ceil <= nums[i])) {
                return true;
            }

            values.add((long)nums[i]);
            if (i >= k) {
                values.remove((long)(nums[i - k]));
            }
        }

        return false;
    }
}

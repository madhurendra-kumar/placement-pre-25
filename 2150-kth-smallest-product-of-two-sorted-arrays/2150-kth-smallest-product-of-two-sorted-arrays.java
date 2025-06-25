
class Solution {

    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {

        long[] neg1 = Arrays.stream(nums1).asLongStream().filter(x -> x < 0).toArray();
        long[] pos1 = Arrays.stream(nums1).asLongStream().filter(x -> x >= 0).toArray();
        long[] neg2 = Arrays.stream(nums2).asLongStream().filter(x -> x < 0).toArray();
        long[] pos2 = Arrays.stream(nums2).asLongStream().filter(x -> x >= 0).toArray();

        int num_negative_products = neg1.length * pos2.length + neg2.length * pos1.length;
        boolean is_positive = k > num_negative_products;

        if (is_positive) {
            k -= num_negative_products;
            reverse(neg1);
            reverse(neg2);
        } else {
            reverse(pos1);
            reverse(pos2);
        }

        long low = (long) -1e10;
        long high = (long) 1e10;

        while (low < high) {
            long mid = low + (high - low) / 2;

            long count = is_positive ? getCount(pos1, pos2, mid) + getCount(neg1, neg2, mid)
                    : getCount(neg1, pos2, mid) + getCount(neg2, pos1, mid);

            if (count >= k)
                high = mid;
            else
                low = mid + 1;
        }

        return low;
    }

    private long getCount(long[] n1, long[] n2, long product) {
        long count = 0;
        int j = n2.length - 1;
        for (long num : n1) {
            while (j >= 0) {
                if (num * n2[j] <= product) {
                    count += j + 1;
                    break;
                } else
                    j--;
            }
        }

        return count;
    }

    private void reverse(long[] nums) {
        for (int i = 0, j = nums.length - 1; i < j; i++, j--) {
            long tmp = nums[i];
            nums[i] = nums[j];
            nums[j] = tmp;
        }
    }
}
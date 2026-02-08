class MedianOdTwoSortedArrays
{
    public static void main(String[] args) {
        int[] nums1 = {1, 2};
        int[] nums2 = {3, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));   
    }
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] res = new int[nums1.length + nums2.length];
        int i = 0, j = 0, k = 0;

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                res[k++] = nums1[i++];
            } else {
                res[k++] = nums2[j++];
            }
        }

        while (i < nums1.length) res[k++] = nums1[i++];
        while (j < nums2.length) res[k++] = nums2[j++];

        int mid = res.length / 2;
        double median;

        if (res.length % 2 != 0) {
            median = res[mid];
        } else {
            median = (res[mid] + res[mid - 1]) / 2.0;
        }

        
        // System.out.println(Arrays.toString(res));
        System.out.println(mid);

        return median;
    }
}
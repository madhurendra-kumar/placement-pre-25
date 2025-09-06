class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int[] arr : image) {

            int i = 0;
            int j = arr.length - 1;

            while (i < j) {
                int tmp = arr[i] ^ 1;
                arr[i] = arr[j] ^ 1;
                arr[j] = tmp;
                i++;
                j--;
            }

            if (i == j) {
                arr[i] ^= 1;
            }
        }

        return image;
    }
}
package CollegeClass;

public class Reverse_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int last = arr.length - 1;

        for (int i = 0; i < arr.length / 2; i++) {
            // Swap the elements
            int temp = arr[i];
            arr[i] = last;
            last = temp;
        }

        // Print the reversed array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(",");
            }
        }

	}

}

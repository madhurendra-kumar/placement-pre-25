package CollegeClass;

public class Chack_Array_sorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,6,7,8};
		boolean flag = true;
		for(int i=0; i<arr.length-1; i++) {
			if(arr[i] > arr[i+1]) {
				flag = false;
			}
		}
		if(flag) {
			System.out.println("Array is sorted");
		}
		else {
			System.out.println("Array is not sorted");
		}
	}

}

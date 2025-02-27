package CollegeClass;

public class MinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {11,2,1,3,54,6,7};
		int min = arr[0];
		for(int i=0; i<arr.length; i++) {
			if(min>arr[i]) {
				min=arr[i];
			}
		}
		System.out.println(min);

	}

}

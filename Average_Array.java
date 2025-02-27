package CollegeClass;

public class Average_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,3,4,5,6,7,8};
		float avg = arr[0];
		float sum = 0;
		int n = arr.length;
		for(int i=0; i<n; i++) {
			sum += arr[i]; 
		}
		avg = sum/n;
		System.out.println("Average number is : "+avg);

	}

}

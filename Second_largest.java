package CollegeClass;

public class Second_largest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {2,5,7,1,4,9,11,8,10};
		int largest = arr[0];
		int Seclargest = -1;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]>largest) {
				Seclargest = largest; // 2
				largest = arr[i]; // 5
			}
			else if(arr[i]<largest && arr[i]>Seclargest) { // 
				Seclargest = arr[i];
			}
		}
		System.out.print(Seclargest);

	}

}

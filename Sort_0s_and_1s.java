package CollegeClass;

public class Sort_0s_and_1s {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {0,1,0,1,1,0}; //[0,0,0,1,1,1]
		
		int count0 = 0;
		int count1 = 0;
		for(int i=0; i<arr.length; i++) {
			if(arr[i]==0) {
				count0++;
			}
			else {
				count1++;
			}
		}
		int index = 0;
		for(int i=0; i<count0; i++) {
			arr[index++] = 0;
		}
		for(int i=0; i<count1; i++) {
			arr[index++] = 1;
		}
		
		for(int num : arr) {
			System.out.print(num);
		}
	}

}

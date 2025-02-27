package CollegeClass;

public class Print_all_subArray {

    public static void main(String[] args) {
        int sum = 0;
        int[] arr = {1, 2, 3, 4}; 
        printAllSubArrays(arr, sum);
    }

    public static void printAllSubArrays(int[] arr, int sum) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                sum = 0;
                System.out.print("[");
                for(int k=i; k<=j; k++) {
                	sum += arr[k];
                	System.out.print(arr[k]);
                	if(k != j) {
                	System.out.print(" ,");
                	}
                }
                System.out.println("] -> Sum: "+ sum);
            }
        }
    }
} 
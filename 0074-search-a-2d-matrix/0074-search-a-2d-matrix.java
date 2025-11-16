class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
      int rows = matrix.length;
      if (rows == 0) return false;
      int cols = matrix[0].length;
      if (cols == 0) return false;

       int findRow = findPotentialRow(matrix, target);
       if(findRow<0)
       return false;

       return binarySearch(matrix[findRow],target);


    }

    int findPotentialRow(int[][] matrix, int target){
        int start=0;
        
        int end=matrix.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(matrix[mid][0]==target)
            return mid;
            if(matrix[mid][0]<target){
                start=mid+1;
            }
            else{
                end=mid-1;
            }

        }
        return end;
    }
    boolean binarySearch(int [] rows, int target){
        int start=0;
        int end=rows.length-1;
        while(start<=end){
            int mid=start+(end-start)/2;
            if(target==rows[mid])
            return true;
            if(rows[mid]<target){
                start=mid+1;
            }
            else
            end=mid-1;
        }
        return false;

    }
}
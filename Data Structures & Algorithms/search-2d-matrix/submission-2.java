class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        return binarySearch(matrix, target, 0, matrix[0].length*matrix.length - 1);
    }
    public boolean binarySearch(int[][] matrix, int target, int start, int end){
        if (start > end) return false;
        int startRow = start/matrix[0].length;
        int startCol = start%matrix[0].length;
        int endRow = end/matrix[0].length;
        int endCol = end%matrix[0].length;
        int mid = (start+end)/2;
        int midRow = mid/matrix[0].length;
        int midCol = mid%matrix[0].length;
        if (matrix[startRow][startCol] == target) return true;
        if (matrix[endRow][endCol] == target) return true;
        if (matrix[midRow][midCol] < target) return binarySearch(matrix, target, mid + 1, end);
        if (matrix[midRow][midCol] > target) return binarySearch(matrix, target, start, mid - 1);
        return true; 
    }
}

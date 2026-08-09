import java.util.*;

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();

        int startRow = 0;
        int endRow = matrix.length - 1;
        int startCol = 0;
        int endCol = matrix[0].length - 1;

        while (startRow <= endRow && startCol <= endCol) {

            // Top row
            for (int i = startCol; i <= endCol; i++) {
                ans.add(matrix[startRow][i]);
            }

            // Right column
            for (int i = startRow + 1; i <= endRow; i++) {
                ans.add(matrix[i][endCol]);
            }

            // Bottom row
            if (startRow < endRow) {
                for (int i = endCol - 1; i >= startCol; i--) {
                    ans.add(matrix[endRow][i]);
                }
            }

            // Left column
            if (startCol < endCol) {
                for (int i = endRow - 1; i > startRow; i--) {
                    ans.add(matrix[i][startCol]);
                }
            }

            startRow++;
            endRow--;
            startCol++;
            endCol--;
        }

        return ans;
    }

    public static void main(String[] args) {

        int[][] matrix = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        Solution obj = new Solution();
        System.out.println(obj.spiralOrder(matrix));
    }
}
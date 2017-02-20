import java.util.*;

/**
 * Created by zhengkevin on 2/19/17.
 */

public class ExtraCredit {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int c = 0;

        for (int i = m; i < m + n; i++) {
            nums1[i] = nums2[i - m];
        }

        for (int i = 0; i < m + n - 1; i++) {
            for (int j = i + 1; j < m + n; j++) {
                if (nums1[i] > nums1[j]) {
                    int t = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = t;
                }
            }
        }

        for (int i = 0; i < m + n; i++) {
            System.out.print(nums1[i] + " ");
        }
    }

    public List<Integer> spiralOrder(int[][] matrix) {

        ArrayList<Integer> l = new ArrayList<Integer>();

        if(matrix.length == 0||matrix == null){
            return l;
        }

        int m = matrix.length;
        int n = matrix[0].length;
        int c = 0;

        int[][] newmatrix = new int[m][n];

        while (c < m && c < n) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    newmatrix[i][j] = 1;
                }
            }

            for (int i = c; i < n - c; i++) {
                if (newmatrix[c][i] != 0) {
                    l.add(matrix[c][i]);
                    newmatrix[c][i] = 0;
                }
            }
            for (int i = c; i < m - c; i++) {
                if (newmatrix[i][n - 1 - c] != 0) {
                    l.add(matrix[i][n - 1 - c]);
                    newmatrix[i][n - 1 - c] = 0;
                }
            }
            for (int i = n - 1 - c; i > -1 + c; i--) {
                if (newmatrix[m - 1 - c][i] != 0) {
                    l.add(matrix[m - 1 - c][i]);
                    newmatrix[m - 1 - c][i] = 0;
                }
            }
            for (int i = m - 1 - c; i > -1 + c; i--) {
                if (newmatrix[i][c] != 0) {
                    l.add(matrix[i][c]);
                    newmatrix[i][c] = 0;
                }
            }
            c++;
        }
        return l;
    }

}

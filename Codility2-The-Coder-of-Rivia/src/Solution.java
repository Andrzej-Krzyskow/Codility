class Solution {

    private long rowSum(int[] A, int row) {
        long sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += A[3 * row + i];
        }

        return sum;
    }

    private long columnSum(int[] A, int column) {
        long sum = 0;

        for (int i = 0; i < 3; i++) {
            sum += A[3 * i + column];
        }

        return sum;
    }

    public int[] solution(int[] A) {
        long maxSum = 0;

        for (int i = 0; i < 3; i++) {

            if (rowSum(A,i) > maxSum) {
                maxSum = rowSum(A,i);
            }

            if (columnSum(A,i) > maxSum) {
                maxSum = columnSum(A,i);
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                A[3*i+j] +=maxSum - Math.max(rowSum(A, i), columnSum(A, j));
            }
        }


        return A;
    }
}
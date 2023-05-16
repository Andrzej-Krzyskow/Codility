class Solution {

    public int solution(int[] A) {
        int size = A.length;
        long currentCost = 0;
        long minimalCost;

        for (int integer : A) {
            currentCost += A[size-1]-integer;
        }
        currentCost -= A[size-1]- A[0];
        minimalCost = currentCost;

        for (int i = 1; i < size-1; i++) {
            currentCost -= A[size - 1] - A[i];
            currentCost += (long) i * (A[i] - A[i - 1]);

            if (currentCost < minimalCost) {
                minimalCost = currentCost;
            }
        }

        return (int) (minimalCost % (Math.pow(10,9)+7));
    }
}
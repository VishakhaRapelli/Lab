package Array;
import java.util.HashMap;
import java.util.Map;
public class PairSumFinder {
    public static void findPairsWithSum(int[] arr, int sum) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int num : arr) {
            int complement = sum - num;
            if (numMap.containsKey(complement)) {
                System.out.println("Pair found: " + num + ", " + complement);
            }
            numMap.put(num, 1);
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int sum = 10;
        System.out.println("Pairs with sum " + sum + ":");
        findPairsWithSum(arr, sum);
    }
}



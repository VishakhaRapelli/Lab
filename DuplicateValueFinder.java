package Array;
import java.util.HashMap;
import java.util.Map;
public class DuplicateValueFinder {
    public static void findDuplicateValues(int[] arr) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int num : arr) {
            if (numMap.containsKey(num)) {
                numMap.put(num, numMap.get(num) + 1);
            } else {
                numMap.put(num, 1);
            }
        }

        boolean hasDuplicate = false;
        for (Map.Entry<Integer, Integer> entry : numMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Duplicate value: " + entry.getKey());
                hasDuplicate = true;
            }
        }
        if (!hasDuplicate) {
            System.out.println("No duplicate values found.");
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 9, 9};
        System.out.println("Duplicate values in the array:");
        findDuplicateValues(arr);
    }
}

}

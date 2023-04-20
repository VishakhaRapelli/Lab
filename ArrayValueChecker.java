package Array;
public class ArrayValueChecker {
	public static boolean containsValue(int[] arr, int value) {
        for (int num : arr) {
            if (num == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int value = 3;
        boolean contains = containsValue(arr, value);
        System.out.println("Array contains value " + value + ": " + contains);
    }

}

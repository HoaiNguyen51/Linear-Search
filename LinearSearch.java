public class LinearSearch {

    public static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] thisArray = {21, 59, 64, 99, 72, 31, 43, 76, 10};
        int target = 31;

        System.out.print("Original Array: ");
        for (int num : thisArray) {
            System.out.print(num + ", ");
        }

        int result = LinearSearch(thisArray, target);

        if (result != -1) {
            System.out.print("\nTarget " + target + " found at index: " + result);
        } else {
            System.out.print("\nTarget " + target + " not found in the array.");
        }
    }
}
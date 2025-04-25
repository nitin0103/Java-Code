public class ZeroEnd {
    public static void main(String[] args) {
        int arr[] = {3, 0, 5, 0, 8, 7, 9, 0, 6};
        int n = arr.length;
        int j = 0; // j is the index for the next non-zero element

        // Move all non-zero elements to the front of the array
        for (int i = 0; i < n; i++) {
            if (arr[i] != 0) {
                arr[j++] = arr[i];
            }
        }
        // Fill the remaining positions in the array with zeros
        while (j < n) {
            arr[j++] = 0;
        }
        // Print the updated array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}





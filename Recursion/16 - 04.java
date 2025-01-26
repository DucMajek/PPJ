public class Main {
    public static void main(String[] args) {
        int[] array1 = {4, 2, 5, 1, 3};
        int[] sortedArray1 = mergeSort(array1);
        System.out.print("Posortowana tablica: ");
        printArray(sortedArray1);

        int[] array2 = {10, -2, 3, 0};
        int[] sortedArray2 = mergeSort(array2);
        System.out.print("Posortowana tablica: ");
        printArray(sortedArray2);

    }

    public static int[] mergeSort(int[] array) {
        if (array == null) {
            return null;
        }

        if (array.length == 0) {
            return new int[0];
        }

        return mergeSortRecursive(array, 0, array.length - 1);
    }
    
    private static int[] mergeSortRecursive(int[] array, int left, int right) {
        if (left == right) {
            return new int[] { array[left] };
        }

        int mid = (left + right) / 2;

        int[] leftSorted = mergeSortRecursive(array, left, mid);
        int[] rightSorted = mergeSortRecursive(array, mid + 1, right);

        return merge(leftSorted, rightSorted);
    }

    private static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;

        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }

        while (i < left.length) {
            result[k++] = left[i++];
        }

        while (j < right.length) {
            result[k++] = right[j++];
        }

        return result;
    }

    private static void printArray(int[] array) {
        if (array == null) {
            System.out.println("null");
            return;
        }

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
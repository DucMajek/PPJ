public class Main {
    public static void main(String[] args) {
        int[] arr1 = new int[]{1, 2, 3, 4, 5};
        int[] arr2 = new int[]{1, 2, 8, 9, 0};
        int[] merge = new int[arr1.length + arr2.length];
        int[] duplicate;
        for (int i = 0, j = 0; i < merge.length; i++) {
            if (i >= arr1.length) {
                merge[i] = arr2[j++];
            } else
                merge[i] = arr1[i];

        }

        for (int i = 0; i < merge.length; i++) {
            System.out.print(merge[i] + " ");
        }
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == arr2[i]) {
                count++;
            }
        }
        duplicate = new int[count];
        System.out.println(" ");
        for (int i = 0,j = 0; i < arr1.length && j < duplicate.length; i++, j++) {
            if (arr1[i] == arr2[i]) {
                duplicate[j]=arr1[i];
            }
        }

        for (int i = 0; i < duplicate.length; i++) {
            System.out.print(duplicate[i] + " ");
        }
    }
}
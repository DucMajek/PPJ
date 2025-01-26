public class Main {
    public static void main(String[] args) {
        char[] array1 = {'a', 'b', 'c'};
        char[] array2 = {'a', 'b', 'c'};
        char[] array3 = {'x', 'y', 'z'};

        char[] result1 = intern(array1);
        char[] result2 = intern(array2);
        char[] result3 = intern(array3);

        System.out.println(result1 == result2); // true - te same referencje
        System.out.println(result1 == result3); // false - różne referencje
        System.out.println(intern(new char[0]) == intern(new char[0])); // true - globalna pustka
    }

    private static final char[] EMPTY_ARRAY = new char[0];

    private static char[][] internedArrays = new char[0][];
    private static int size = 0;

    public static char[] intern(char[] input) {
        if (input == null) {
            return null;
        }

        if (input.length == 0) {
            return EMPTY_ARRAY;
        }

        for (int i = 0; i < size; i++) {
            if (areArraysEqual(internedArrays[i], input)) {
                return internedArrays[i];
            }
        }
        addArray(input);
        return input;
    }

    private static void addArray(char[] input) {
        if (size == internedArrays.length) {
            int newCapacity = (size == 0) ? 1 : size * 2; // Rozmiar początkowy 1, potem podwajanie
            char[][] newInternedArrays = new char[newCapacity][];

            for (int i = 0; i < size; i++) {
                newInternedArrays[i] = internedArrays[i];
            }
            internedArrays = newInternedArrays;
        }

        internedArrays[size] = input;
        size++;
    }


    private static boolean areArraysEqual(char[] array1, char[] array2) {
        if (array1.length != array2.length) {
            return false;
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
}
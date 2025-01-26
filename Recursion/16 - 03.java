//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        char[] arr = {'a', 'b', 'c', 'd', 'e', 'f', 'g'};

        reverse(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static char[] reverse(char[] arr, int left, int right) {
        if (arr.length == 0)
            return arr;
        if (arr == null)
            return null;
        if(left == right || left > right) {
            return arr;
        }
        else if (left < right){
            char tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
            return reverse(arr, left + 1, right - 1);
        }
        return arr;

    }
}
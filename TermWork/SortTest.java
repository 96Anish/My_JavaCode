import java.util.Arrays;
interface Sortable {
    void sort(int[] array);
}
class Bubble implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted using Bubble Sort: " + Arrays.toString(array));
    }
}
class Selection implements Sortable {
    @Override
    public void sort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = array[minIndex];
            array[minIndex] = array[i];
            array[i] = temp;
        }
        System.out.println("Sorted using Selection Sort: " + Arrays.toString(array));
    }
}
public class SortTest {
    public static void main(String[] args) {
        int[] arr1 = {5, 3, 8, 1, 2};
        int[] arr2 = {7, 4, 6, 9, 1};
        Sortable bubbleSort = new Bubble();
        Sortable selectionSort = new Selection();
        bubbleSort.sort(arr1);
        selectionSort.sort(arr2);
    }
}

public class SelectionSort implements SortingAlgorithm {
    public void sort(int[] a) {
        int temp, index;
        for (int i = 0; i < a.length-1; i++) {
            index = i;
            for (int j = i+1; j < a.length; j++) {
                if (a[j] < a[index])
                    index = j;
            }
            temp = a[index];
            a[index] = a[i];
            a[i] = temp;
        }
    }
}
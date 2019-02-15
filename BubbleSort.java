public class BubbleSort implements SortingAlgorithm {
    public void sort(int[] a) {
        int temp;
        boolean sorted = false;
        for (int i = a.length -1; i >= 1 && !sorted; i--) {
            sorted = true;
            for (int j = 0; j < i; j++) {
                if (a[j+1] < a[j]) {
                    sorted = false;
                    temp = a[j+1];
                    a[j+1] = a[j];
                    a[j] = temp;
                }
            }
        }
    }
}


/**
 * SortingAlgorithm is just a decorator for sorting.
 * (A real implementation would require a comparator and sort any object using a template.)
 * @author dgbrizan
 *
 */
public interface SortingAlgorithm {

	void sort(int [] a);

	public static void print(int[] a) {
	    for (int value: a)
            System.out.print(value + " ");
        System.out.println();
    }
}

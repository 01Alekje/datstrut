public abstract class Lab1 {
    /* Sorting algorithms */
    // Insertion sort.
    public static void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            if(array[i -1] > array[i]){
                insert(i, array);
            }
        }
    }

    public static void insert(int i, int[] arr){
        for (int j = 0; j < arr.length; j++){
            if (arr[j] >= arr[i]) {
                swap(arr, i, j);
            }
        }
    }

    // Quicksort.
    /*public static void quickSort(int[] arr) {
        int pivot = 0;



        int end = arr.length;
        for () {
            pivot = partition(arr, pivot, end);
        }
        int rivot = partition(arr, );
        quickSort(arr, arr[0], pivot-1);
        quickSort(arr, pivot+1, arr.length -1);
    }*/

    static void quickSort2(int[] arr, int low, int high)
    {
        if (low < high) {

            // pi is partitioning index, arr[pi]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort2(arr, low, pi - 1);
            quickSort2(arr, pi + 1, high);
        }
    }
/*

// call as sort(a, 0, a.length-1);
void sort(int[] a, int low, int high) {
if (low >= high) return;
int pivot = partition(a, low, high);
// assume that partition returns the
// index where the pivot now is
sort(a, low, pivot-1);
sort(a, pivot+1, high);
}

    qsort :: Ord a => [a] -> [a]
    qsort [] = []
    qsort (p:xs) = qsort smaller ++ p : qsort larger
        where
            (smaller, larger) = partition (< p) xs */
    // Quicksort part of an array
    private static void quickSort(int[] arr, int begin, int end) {


    }

    // Partition part of an array, and return the index where the pivot
    // ended up.
    private static int partition(int[] array, int begin, int end) {
        int pivot = array[end];
        // i is the position that pivot should have.
        int i = begin;

        for (int j = begin; j < end; j++) {
            if (array[j] < pivot) {
                swap(array, i, j);
                i++;
            }
        }
        swap(array, i, end);
        return i;
    }

    // Swap two elements in an array
    private static void swap(int[] array, int i, int j) {
        int x = array[i];
        array[i] = array[j];
        array[j] = x;
    }

    // Mergesort.
    public static int[] mergeSort(int[] array) {
        throw new UnsupportedOperationException();
    }

    // Mergesort part of an array
    private static int[] mergeSort(int[] array, int begin, int end) {
        throw new UnsupportedOperationException();
    }

    // Merge two sorted arrays into one
    private static int[] merge(int[] left, int[] right) {
        throw new UnsupportedOperationException();
    }
}

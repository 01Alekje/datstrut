import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] ls = {7,2,5,6,7,4,33,6,7,8,89};
        //Lab1.insertionSort(ls);
        Lab1.quickSort2(ls, 0, ls.length - 1);

        System.out.println(Arrays.toString(ls));
    }


}


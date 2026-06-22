import java.util.Arrays;

class SortData<T extends Comparable<T>> {

    T[] arr;

    SortData(T[] arr) {
        this.arr = arr;
    }

    void sort() {
        Arrays.sort(arr);

        for (T item : arr)
            System.out.print(item + " ");
    }
}
 class GenericSortDemo {

    public static void main(String[] args) {

        Integer nums[] = {5, 2, 8, 1, 9};

        SortData<Integer> obj =
                new SortData<>(nums);

        obj.sort();
    }
}
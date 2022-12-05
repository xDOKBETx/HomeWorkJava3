public class TaskJava1 {
    int[] array;
    int[] tempArray;
    int length;

    public static void main(String[] args) {
        int[] arrayToSort = {30, 7, 79, 8, 8, 47, 26, 7, 47};
        TaskJava1 arr = new TaskJava1();
        arr.sort(arrayToSort);
        System.out.print("Сортированный список: ");
        for (int i : arrayToSort) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.print("\nДлина списка: " + arrayToSort.length);
    }

    public void sort(int[] arrayToSort) {
        this.array = arrayToSort;
        this.length = arrayToSort.length;
        this.tempArray = new int[length];
        Merge_Sort(0, length - 1);
    }

    public void Merge_Sort(int low, int high) {
        if (low < high) {
            int mid = low + (high - low) / 2;
            Merge_Sort(low, mid);
            Merge_Sort(mid + 1, high);
            Merge(low, mid, high);
        }
    }

    public void Merge(int low, int mid, int high) {
        if (high + 1 - low >= 0) System.arraycopy(array, low, tempArray, low, high + 1 - low);
        int i = low;
        int j = mid + 1;
        int k = low;
        while (i <= mid && j <= high) {
            if (tempArray[i] <= tempArray[j]) {
                array[k] = tempArray[i];
                i++;
            } else {
                array[k] = tempArray[j];
                j++;
            }

            k++;
        }
        while (i <= mid) {
            array[k] = tempArray[i];
            i++;
            k++;
        }
    }
}

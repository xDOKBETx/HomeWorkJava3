
// Пусть дан произвольный список целых чисел, удалить из него четные числа



import java.util.ArrayList;
import java.util.Random;

public class TaskJava2 {
    public static ArrayList<Integer> GetRandomArray(int n) {
        ArrayList<Integer> newArray = new ArrayList<>(n);
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            newArray.add(random.nextInt(0, 11));
        }
        return newArray;
    }


    public static void main(String[] args) {
        System.out.println("Пусть дан произвольный список целых чисел, удалить из него четные числа.");
        System.out.print("Первоначальный список: ");
        ArrayList<Integer> nArray = GetRandomArray(10);
        System.out.println(nArray);
        for (int i = nArray.size() - 1; i >= 0; i--) {
            if (nArray.get(i) % 2 == 0) {
                nArray.remove(i);
            }
        }
        System.out.print("Отсортированный список: ");
        System.out.println(nArray);
    }
}
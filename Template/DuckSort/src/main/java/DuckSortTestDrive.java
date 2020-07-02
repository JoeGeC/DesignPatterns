import java.util.Arrays;

import static java.util.Arrays.swap;

public class DuckSortTestDrive {
    public static void main(String[] args){
        Duck[] ducks = {
                new Duck("Daffy", 8),
                new Duck("Dewey", 2),
                new Duck("Howard", 7),
                new Duck("Louie", 2),
                new Duck("Donald", 10),
                new Duck("Huey", 2)
        };

        System.out.println("Before sorting:");
        display(ducks);

        Arrays.sort(ducks);

        System.out.println("\nAfter sorting:");
        display(ducks);
    }

    private static void display(Duck[] ducks) {
        for (Duck duck : ducks) System.out.println(duck);
    }

    public static void sort(Object[] a){
        Object aux[] = (Object[])a.clone();
        mergeSort(aux, a, 0, a.length, 0);
    }

    private static void mergeSort(Object[] src, Object[] dest, int low, int high, int off) {
        for(int i = low; i < high; i++){
            for(int j = i; j > low && ((Comparable)dest[j-1]).compareTo((Comparable)dest[j]) > 0; j--)
                swap(dest, j, j - 1);
        }
        return;
    }
}

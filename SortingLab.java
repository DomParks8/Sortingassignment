import java.util.*;

/**
 * SortingLab
 */
public class SortingLab {
    public static void main(String[] args) {
        ArrayList<Integer> sortPrac = new ArrayList<>();
        int[] array = new int[100];
        Random rand = new Random();
        for (int i = 0; i < array.length; i++)
            array[i] = rand.nextInt(100) + 1;
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        // in reverse order
        for (int i = array.length - 1; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }

}

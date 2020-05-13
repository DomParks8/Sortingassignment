import java.util.*;

public class SortingLab {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>(); // making an arrayList
        Random rand = new Random(); // calling Random Function

        for (int i = 0; i < 100; i++) {
            int randomNumber = rand.nextInt(100);
            numbers.add(randomNumber);
        } // using For Loop

        System.out.println("100 Random Numbers: " + numbers); // Print out Numbers

        // The sort method iterates through the loop and compares items to one another.
        Collections.sort(numbers);
        System.out.println("Ascending numbers: " + numbers);

        // This method sorts items in descending order.
        Collections.sort(numbers, Collections.reverseOrder());
        System.out.println("Descending numbers: " + numbers);
    }
}

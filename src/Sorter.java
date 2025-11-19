import java.util.Arrays;

public class Sorter {

    public static void main(String[] args) {

        //Testing for Git Excercise
        int[] nums = {5, 1, 4, 2, 3};
        int[] sortedNums = sortInts(nums);

        String[] words = {"banana", "apple", "cherry"};
        String[] sortedWords = sortStrings(words);

        System.out.println("Original ints:  " + Arrays.toString(nums));
        System.out.println("Sorted ints:    " + Arrays.toString(sortedNums));

        System.out.println("Original words: " + Arrays.toString(words));
        System.out.println("Sorted words:   " + Arrays.toString(sortedWords));
    }

    public static int[] sortInts(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length);
        Arrays.sort(copy);
        return copy;
    }

    public static String[] sortStrings(String[] words) {
        String[] copy = Arrays.copyOf(words, words.length);
        Arrays.sort(copy);
        return copy;
    }
}

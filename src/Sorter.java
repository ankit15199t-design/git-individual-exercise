import java.util.Arrays;
public class Sorter {

    public static void main(String[] args) {
        int[] nums = {5, 1, 4, 2, 3};
        int[] sorted = sortInts(nums);

        System.out.println("Original ints: " + Arrays.toString(nums));
        System.out.println("Sorted ints:   " + Arrays.toString(sorted));
    }


    public static int[] sortInts(int[] nums) {
        int[] copy = Arrays.copyOf(nums, nums.length); // don’t change original
        Arrays.sort(copy);
        return copy;
    }


    public String[] sortStrings(String[] words) {
        // TODO: feature 2
        return words;
    }
}

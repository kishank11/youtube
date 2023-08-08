import java.util.*;

public class TwoNumberSum {

    public static int[] findTwoNumbersSum(int[] nums, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (numMap.containsKey(complement)) {
                return new int[] {
                        numMap.get(complement), i
                };
            }
            ;
            numMap.put(nums[i], i);
        }
        return new int[0];
    }

    public static void main(String[] args) {

        int[] nums = { 3, 5, -4, 8, 11, 1, -1, 6 };
        int target = 10;
        int[] result = findTwoNumbersSum(nums, target);
        if (result.length == 2) {
            System.out.println("Indices of the two numbers " + result[0] + "," + result[1]);
            System.out.println("Numbers: " + nums[result[0]] + "," + nums[result[1]]);

        } else {
            System.out.println("No Solution");
        }

    }
}
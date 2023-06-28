package Basics;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Unibit {
    public static int[][] findTwoSumAndDouble(int[] nums, int target) {
        int[][] result = new int[2][];

        // Step 1: Find two integers with sum equal to the target value
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                result[0] = new int[]{nums[i], complement};
                break;
            }
            map.put(nums[i], i);
        }

        // Step 2: Double the target value
        int doubleTarget = target * 2;

        // Step 3: Find two integers with sum equal to the doubled target value
        map.clear();
        for (int i = 0; i < nums.length; i++) {
            int complement = doubleTarget - nums[i];
            if (map.containsKey(complement)) {
                result[1] = new int[]{nums[i], complement};
                break;
            }
            map.put(nums[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        int[][] result = findTwoSumAndDouble(arr, target);

        System.out.println("Step 1: " + Arrays.toString(result[0]));
        System.out.println("Step 2: " + (target * 2));
        System.out.println("Step 3: " + Arrays.toString(result[1]));

    }

}

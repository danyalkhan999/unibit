package Basics;

import java.util.*;

public class Unibit {
    public static int[][] findTwoSumAndDouble(int[] nums, int target) {
        int[][] result = new int[2][];

        // Step 1: Find two integers with sum equal to the target value
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = new int[]{nums[i], nums[j]};
                    break;
                }
            }
        }

        // Step 2: Double the target value
        int doubleTarget = target * 2;

        // Step 3: Find the combination of digits in the array that equals the doubled target value
        List<Integer> combination = new ArrayList<>();
        for (int num : nums) {
            if (num == doubleTarget) {
                combination.add(num);
            }
        }

        // Step 4: Convert the combination list to an array
        result[1] = new int[combination.size()];
        for (int i = 0; i < combination.size(); i++) {
            result[1][i] = combination.get(i);
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

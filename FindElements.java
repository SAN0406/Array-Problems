package com.cdac.main;

import java.util.HashSet;

public class FindElements {

	public static int[] findElements(int[] arr) {
        int n = arr.length;
        HashSet<Integer> seen = new HashSet<>();
        int repeat = -1;
        
        for (int num : arr) {
            if (seen.contains(num)) {
                repeat = num;
            }
            seen.add(num);
        }
        
        int missing = -1;
        for (int i = 1; i <= n; i++) {
            if (!seen.contains(i)) {
                missing = i;
                break;
            }
        }
        
        int[] missingRepeat = {missing, repeat};
        return missingRepeat;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 9, 8, 7, 7};
        int[] result = findElements(arr);
        System.out.println("missing_repeat = " + result[0] + " " +  result[1]);
    }
}

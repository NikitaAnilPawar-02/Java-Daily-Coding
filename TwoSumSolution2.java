import java.util.*;

class TwoSumSolution2 {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int needed = target - numbers[i]; 
            if (map.containsKey(needed)) {
                return new int[]{map.get(needed), i};
            }
            map.put(numbers[i], i);
        }
        return new int[]{-1, -1}; 
    }

    public static void main(String[] args) {
        TwoSumSolution2 obj = new TwoSumSolution2();
        int numbers[] = {2, 7, 11, 15};
        int target = 9;
        int result[] = obj.twoSum(numbers, target);
        System.out.println(result[0] + " " + result[1]); 
    }
}

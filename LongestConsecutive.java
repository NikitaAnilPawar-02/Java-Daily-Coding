import java.util.*;

class LongestConsecutive{
    public static void main(String[] args){
        int[] arr = {200,2,1,3,4,100};
        System.out.print("Longest Consecutive Sequence : " +LongestConsecutiveSequence (arr));
    }

    public static int LongestConsecutiveSequence (int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i: arr){
            set.add(i);
        }

        int maxLength = 0;

        for(int i: arr){
            if(!set.contains(i-1)){
                int currentNum = i;
                int currentLength = 1;

                while(set.contains(currentNum+1)){
                    currentNum++;
                    currentLength++;
                }

                maxLength = Math.max(currentLength,maxLength);
            }
        }
        return maxLength;
    }
}

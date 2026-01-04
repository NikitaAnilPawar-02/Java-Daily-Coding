import java.util.*;

class SingleNumber{
	public static void main(String args[]){
		int nums[] = {4,1,2,1,2};
		
		HashMap<Integer, Integer> counter = new HashMap<>();
		for(int i=0; i<nums.length; i++){
			counter.put(nums[i], counter.getOrDefault(nums[i], 0) + 1);
		}
		
		for(Map.Entry<Integer,Integer> ele: counter.entrySet()){
			if(ele.getValue() == 1)
			{	
				System.out.println(ele.getKey());
			}
		}
	}
}

import java.util.*;
class MergeTwoSortedArrays{
	public static void main(String args[]){
		int a1[] = {1,2,5,6};
		int a2[] = {3,7,8,9,10,12};

		ArrayList<Integer> list = new ArrayList<>();
		int i=0, j=0;

		while(i<a1.length && j<a2.length){
			if(a1[i]<a2[j]){
				list.add(a1[i]);
				i++;
			}else{
				list.add(a2[j]);
				j++;
			}
		}

		while(i<a1.length){
			list.add(a1[i]);
			i++;
		}

		while(j<a2.length){
			list.add(a2[j]);
			j++;
		}
	
		for(int ele: list){	
			System.out.print(ele+" ");
		}
	}
}

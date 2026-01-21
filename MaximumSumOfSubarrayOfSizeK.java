class MaximumSumOfSubarrayOfSizeK{
	public static void main(String args[]){
		int arr[] ={1, 4, 2, 10, 2, 3, 1, 0, 20};
		int k=5;

		int sum =0, maxSum=0;

		for(int i=0; i<k; i++){
			sum += arr[i];
		}
		maxSum = sum;
	
		for(int i=k; i<arr.length; i++){
			sum += arr[i];
			sum -= arr[i - k];
		
			if(sum >maxSum){
				maxSum = sum;
			}
		}

		System.out.println("Maximum sum of subarray of size " + k +" is: "+maxSum); 
	}
}

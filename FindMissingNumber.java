class FindMissingNumber{
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6,8,9,10};
        int n = arr.length + 1;
      
        int sum = 0;
        for(int i=1; i<=n; i++){
            sum += i;
        }
        
        int total = 0;
        for(int i=0; i<n-1; i++){
            total += arr[i];
        }
       
        System.out.println("Original Array: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println("\nThe Missing Number: "+(sum - total));
    }
}
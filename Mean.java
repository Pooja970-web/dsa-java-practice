class Mean{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int n= arr.length;
        int sum=0;
        double mean;
        for(int i=0; i<n; i++){
            sum+=arr[i];
        }
        mean=sum/n;
        
        System.out.println(mean);
        
    }
}
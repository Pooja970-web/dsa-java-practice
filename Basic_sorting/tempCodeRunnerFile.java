public class KthSorted{
  public static int KthSmallest(int a[],int k){
    int n=arr.length;
    for(int i=0,i<k;i++){
      int min=Integer.MAX_VALUE,mindex=-1;
      for(int j=i;j<n;j++){
        if(arr[i]<min){
           min=arr[j];
           mindex=j;
        }
      }
      int temp=arr[i];
      arr[i]=arr[mindex];
      arr[mindex]=temp;
    }
  }
public static void main(String[] args) {
  int arr[]={3,4,6,1,0,2};
  int k=3;
return arr[k-1];
}
}
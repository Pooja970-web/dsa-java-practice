package Basic_Sorting;
public class BubbleSort
 {
  public static void print(int []arr) {
    for(int ele:arr){
      System.out.println(ele+"");
    }
    System.out.println();
  }
  public static void main(String[] args) {
    int []arr={5,-2,6,7,2,8,7,2};
    int n=arr.length;
    System.out.print(arr);
    for(int j=1;j<=n-1;j++){
      for(int i=0;i<=n-1;i++){
        if(arr[i]>arr[i+1]){
          int temp=arr[i];
          arr[i]=arr[i+1];
          arr[i+1]=temp;
        }
      }
    }
    System.out.print(arr);
  }
}

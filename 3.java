import java.util.Stack;
 
public class ReverseArrayUsingStack {
    public static void reverseArrayUsingStack(int[] arr) {
      int arr_new[]=new int[arr.length];
      for(int i=0;i<arr.length;i++){
        arr_new[i]=arr[arr.length-1-i];
      }
      for(int ele:arr_new){
        System.out.println(ele);
      }
     
    }
    public static void rev2(int[] arr){
      int start=0;
      int end=arr.length-1;
      int temp;
      while(start<end){
        temp=start;
        start=end;
        end=temp;
        start++;
        end--;
      }
      for(int ele:arr){
        System.out.println(ele)
      }
    }
  public static void rev3(int[] arr){
    Stack<Integer> stack1=new Stack();
    for(int ele:arr){
      stack1.push(ele)
        }
    for(i=0;i<arr.length;i++){
      arr[i]=stack1.pop();
    }
    for(int ele:arr){
      System.out.println(ele);
    }
  }
  
 
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
 
        reverseArrayUsingStack(arr);
 
        System.out.print("Reversed Array: ");
        for (int element : arr) {
            System.out.print(element + " ");
        }
    }
}

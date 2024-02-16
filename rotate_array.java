/*package whatever //do not write package name here */

import java.io.*;

class Rotate_Array {


// Function to rotate array
static void Rotate(int arr[], int d, int n)
{
  int[] temp=new int[n];
  int k=0;
  for(int i=d;i<n;i++){
    temp[k]=arr[i];
    k++;
  }
  for(int i=0;i<d;i++){
    temp[k]=arr[i];
    k++;
  }
  for(int i=0;i<n;i++){
    arr[i]=temp[i];
  }
}
static int arraySortedOrNot(int arr[], int n){
  if(arr.length==0 || arr.length==1){
    return 1;
  }
  if(arr[n-1]<arr[n-2]){
    return 0;
  }
  arraySortedOrNot(arr,n-1);
}
// Input  : 1, 1, 1, 2, 2, 3
// Output : 1 2 3
 static void printDistinct(int arr[], int n) { 
   int temp=new int[n];
   Arrays.sort(arr);
   for(int i=0;i<n;i++){
     if(arr[i]!=arr[i+1]){
       temp=temp+arr[i];
     }
   }
 }
//   Input: arr[] = {12, 10, 9, 45, 2, 10, 10, 45}
// Output: 12, 10, 9, 2
  // sort the array , n if previous is not equal to current store in arr

//   Input : arr[] = {7, 1, 2, 3, 4, 5, 6}
// Output : 7 1 6 2 5 3 4
  static void alternateSort(int arr[], int n)
    {
      Arrays.sort(arr);
      int temp=arr[1];
      arr[1]=arr[n-1];
      int temper=
      for(int i=2,i<n;i++){
        arr[i]=temp;
        temp=arr[i+1];
      }
      for(int ele:arr){
        System.out.println(ele);
      }
    }
//   Input:  arr[] = {10, 5, 6, 3, 2, 20, 100, 80}
// Output: arr[] = {10, 5, 6, 2, 20, 3, 100, 80} 
  void sortInWave(int arr[], int n)
    {
      Arrays.sort(arr);
      int temp;
      for(int i=0;i<n;i++){
        temp=arr[i];
        arr[i]=arr[i+1];
        arr[i+1]=temp;
      }
    }
//   input: arr[] = {1, 4, 20, 3, 10, 5}, sum = 33
// Output: Sum found between indexes 2 and 4
// Explanation: Sum of elements between indices 2 and 4 is 20 + 3 + 10 = 33
 
        
  
        
          
      
       
       
       
  
  
    
  

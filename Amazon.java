Given array arr1[] = { 11, 1, 13, 21, 3, 7 } and arr2[] = { 11, 3, 7, 1 }.

Step 1: We will store the array arr1[] and arr2[] elements in Set

The final Set = { 1, 3, 7, 11, 13, 21}
Step 2: Size of arr1[] = 6 and size of the Set = 6

Hence no new elements are found in arr2[]
As all the elements are found we can conclude arr2[] is the subset of arr1[].

 {
 
        int arr1[] = { 11, 1, 13, 21, 3, 7 };
        int arr2[] = { 11, 3, 7, 1 };
        int m = arr1.length;
        int n = arr2.length;
 
        Set<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < m; i++) {
            s.add(arr1[i]);
        }
        int p = s.size();
        for (int i = 0; i < n; i++) {
            s.add(arr2[i]);
        }
 
        if (s.size() == p) {
            System.out.println("arr2[] is subset of arr1[] "
                               + "\n");
        }
        else {
            System.out.println(
                "arr2[] is not subset of arr1[] "
                + "\n");
        }
    }


2. Union and Intersection of two Linked List using Hashing

node start1=head;
node start2=head2;
while(start1!=null || start2!=null){
  if(start1!=null){
    //map me store karo ele:count
    Map<Integer,Integer> mp=new HashSet<>();
    mp.put(mp.getOrDefault(start1.data,1)+1); start1=start1.next
    mp.put(mp.getOrDefault(start1.data,1)+1);  start2=start2.next


    // all keys ki list creation
    
    for(int key1:mp.keySet()){
      Node res=null;
      Node l3=new Node(Key1);
      l3.next=res;
      res=l3; //shift one step


3. Input: arr[] = {0, -1, 2, -3, 1}, x= -2
Output: Yes
Explanation:  If we calculate the sum of the output,1 + (-3) = -2



  1.two pointers 
  2. at each time fill the hashset n check t-a[i] in that set if yes then true
 2.  {
        HashSet<Integer> s = new HashSet<Integer>();
        for (int i = 0; i < arr.length; ++i) {
            int temp = sum - arr[i];
 
            // checking for condition
            if (s.contains(temp)) {
                System.out.println("Yes");
                return;
            }
            s.add(arr[i]);
        }
        System.out.println("No");
    }

      3, union of two array
          {
 
        // Defining set container s
        HashSet<Integer> s = new HashSet<>();
 
        // Inserting array elements in s
        for (int i = 0; i < n; i++)
            s.add(a[i]);
 
        for (int i = 0; i < m; i++)
            s.add(b[i]);
        System.out.print(
            "Number of elements after union operation: "
            + s.size() + "\n");
        System.out.print("The union set of both arrays is :"
                         + "\n");
 
        System.out.print(
            s.toString()
            + " "); // s will contain only distinct

        

        4. intersection of two array


              public static void printIntersection(int[] arr1, int[] arr2, int m, int n) {
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i = 0;
        int j = 0;
        while (i < m && j < n) {
            if (arr1[i] < arr2[j]) {
                i += 1;
            } else if (arr2[j] < arr1[i]) {
                j += 1;
            } else {
                System.out.println(arr2[j]);
                j += 1;
                i += 1;
            }
        }
    }
          

3 . Count of equal value pairs from given two Arrays such that a[i] equals b[j]


  Input: a[] = {1, 1, 3, 3, 3, 5, 8, 8}, b[] = {1, 3, 3, 4, 5, 5, 5}
Output: 11
Explanation: Following are the 11 pairs with given condition The 11 pairs are {{1, 1}, {1, 1}, {3, 3}, {3, 3}, {3, 3}, {3, 3}, {3, 3}, {3, 3}, {5, 5}, {5, 5}, {5, 5}} . 

Input: a[] = {1, 2, 3, 4}, b[] = {1, 1, 2}
Output: 3

  

make a map for two array  ; map1={1:2,3:3,5:1,8:2} map2={1:1,3:2,4:1,5:3}
finalmap={1:2*1,3:3*2,5:1*3,8:2*0,4:1*0}
return sum(values)(2+6+3+0+0)



PROBLEM  OF DAY!!!!!
Input : arr[] = {3, 2, 1, 2, 1, 4, 5, 8, 6, 7, 4, 2}
Output: 10
// maximum distance for 2 is 11-1 = 10 
// maximum distance for 1 is 4-2 = 2 
// maximum distance for 4 is 10-5 = 5 


  
  res=-1;
  for(int i=0;i<n;i++){
    for(j=i+1;j<n;j++){
      if(a[j]==a[i]){
        res=Math.max(res,j-i);
      // res=Math.max(res,a[i]-a[j])
        }
  }
    return res


//   An efficient solution to this problem is to use hashing.
//   The idea is to traverse the input array and store the index of the first occurrence in a hash map. 
// For every other occurrence, find the difference between the index and the first index stored in the hash map. If the difference is more than the result so far, then update the result.


   { 
        
        HashMap<Integer, Integer> map = new HashMap<>(); 
        int max_dist = 0; 
  
        for (int i = 0; i < n; i++) 
        { 
          
            if (!map.containsKey(arr[i])) 
                map.put(arr[i], i); 
  
            else
                max_dist = Math.max(max_dist, i - map.get(arr[i])); 
        } 
  
        return max_dist; 
} 

    
  PROBLEM NEXT !!!1

    Input: set1[] = {12, 34, 11, 9, 3}
       set2[] = {2, 1, 3, 5}
Output: Not Disjoint
3 is common in two sets.
Input: set1[] = {12, 34, 11, 9, 3}
       set2[] = {7, 2, 1, 5}
Output: Yes, Disjoint
There is no common element in two sets.



  
      
  
      
      
  
    
  
  




  
      
    

  

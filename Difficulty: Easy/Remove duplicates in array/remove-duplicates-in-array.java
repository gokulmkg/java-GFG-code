class Solution {
    ArrayList<Integer> removeDuplicate(int arr[]) {
        // code here
         LinkedHashSet<Integer> set = new LinkedHashSet<>();
         for(int st :arr){
             set.add(st);
         }
      return new ArrayList<>(set);
    }
}
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        
        for (Integer n : nums1) set1.add(n);
        for (Integer n : nums2) set2.add(n);
        
        List<Integer> returnList = new ArrayList<>();
        
        if (set1.size()<set2.size()){
            for (Integer n : set1){
                if(set2.contains(n)){
                    returnList.add(n);
                }
            }
        } else {
            for (Integer n : set2){
                if(set1.contains(n)){
                    returnList.add(n);
                }
            }
        }
        
        int[] returnArray = returnList.stream().mapToInt(i -> i).toArray();
        
        return returnArray;
        
    }
}
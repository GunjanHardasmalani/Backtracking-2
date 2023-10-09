class Solution {
    List<List<Integer>> result;
    public List<List<Integer>> subsets(int[] nums) {

        result = new ArrayList<>();
        recurse(nums, 0, new ArrayList<>()); 

        return result;
    }

    public void recurse(int[] nums, int index, List<Integer> path){
        
        result.add(new ArrayList<>(path));

        for(int i=index; i<nums.length; i++){
            path.add(nums[i]);
            recurse(nums, i + 1, path);
            path.remove(path.size() -1);
        }
    }
}
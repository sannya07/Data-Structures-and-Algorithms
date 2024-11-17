class Solution {
    public void func(int[] candidates, int index,int k,List<Integer> v,List<List<Integer>> result){
        if(k==0){
            result.add(new ArrayList<>(v));
            return;
        }
        if(index<0 || k<0){
            return;
        }
        v.add(candidates[index]);
        func(candidates,index,k-candidates[index],v,result);
        v.remove(v.size()-1);
        func(candidates,index-1,k,v,result);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result= new ArrayList<>();
        func(candidates,candidates.length-1,target,new ArrayList<>(),result);
        return result;
    }
}
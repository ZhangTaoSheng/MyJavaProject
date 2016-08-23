import java.util.*;
public class Combination_sum_leetCode_39 {
  public List<List<Integer>> combinationSum(int[] candidates, int target) {
	 List<List<Integer>> ret = new ArrayList<>();
	 List<Integer> temp = new ArrayList<>();
	 Arrays.sort(candidates);
	 findSum(candidates,target,0,0,temp,ret);
 
	 return ret;
    }
public void findSum(int [] candidates, int target,int sum,int start ,List<Integer>temp,List<List<Integer>>ret){
	if(sum == target){
		ret.add(new ArrayList<>(temp));
		return;
	} else if (sum>target){//比target大，则当前的数字不需要再匹配了。
		return;
	}else { //比target小，则需要继续加当前level的个数
		for(int i = start;i<candidates.length;i++){
			temp.add(candidates[i]);
			findSum(candidates,target,sum+candidates[i],i,temp,ret);//不限个数的配重，所以，下次还是从当前的元素开始配重
			temp.remove(temp.size()-1);//如果没有返回，说明最后一个过大。
		}
	}
	
}
}
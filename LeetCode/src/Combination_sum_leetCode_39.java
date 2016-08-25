/**
 * @author zts
 * @version 2016/8/25
 * @description 在数组中找出累加值为指定数值的集合，元素不能重复。
 * dfs算法必须保证当前节点搜索完毕后，pop掉当前节点。进入下一个平级的节点。
 */
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
				temp.remove(temp.size()-1);//深度搜索，当前匹配结束以后，需要返回到上层。
			}
		}

	}
public static void main (String args[]){
	Combination_sum_leetCode_39 ls = new Combination_sum_leetCode_39();
	 Scanner in = new Scanner(System.in);
	 System.out.println("请输入数组长度：");
	 int len = in.nextInt();
	 int [] candidates = new int [len];
	 System.out.println("请输入数组元素：");
	 for(int i=0;i<len ;i++)
	 {
		 candidates[i] = in.nextInt();
	 }
	 System.out.println("程序开始！");
	 int target = 10;
	 List<List<Integer>> ret = ls.combinationSum(candidates, target);
	 for(int i = 0;i<ret.size();i++)
	 {
		 System.out.print("第 "+i+" 个组合：");
		 List<Integer> temp = ret.get(i);
		 for(int j =0; j<temp.size();j++){
			 System.out.print(temp.get(j)+" ");			 
		 }
		System.out.println();		 
	 }
}
}
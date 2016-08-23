import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年2月25日 下午9:21:20 
 * 类说明 
 * 在已知数组中，是的组合的和等于target,不可以重复使用
 */
public class CombinationSumII_leetCode_40 {
	public List<List<Integer>> combinationSum2(int[] candidates, int target) {
	    List<List<Integer>>ret = new ArrayList<>();
	    List<Integer> temp = new ArrayList<>();
	    //边界条件判断
	    if(candidates == null || candidates.length == 0)
	        return ret;
	    //先排序，然后利用递归算法
	    Arrays.sort(candidates);//先排列
	    findSum2(candidates,target,temp,ret,0,0);//递归的初始值 ，sum = 0,start_index = 0;
	   
	    
	    //去掉重复的，可以用HashSet筛选一次，然后在加入到结果集中。
	    HashSet<List<Integer>> set = new HashSet<List<Integer>>(ret);
	    //remove duplicate lists
	    ret.clear();
	    ret.addAll(set);
	    
	    return ret;
		 
    }
	public void findSum2(int []candidates,int target,List<Integer>temp,List<List<Integer>>ret,int sum, int start){
		if(sum == target){//先判断是否已经满足条件，如果满足条件了，就加入结果集中
			ret.add(new ArrayList<>(temp));
			return;
		}else if (sum>target){
			return;			
		}else {//如果还是比target小，则继续往后试探。此时的start 值是上一次递归传进来的后一个元素。
			for(int i = start; i<candidates.length;i++){//从当前值开始寻找，往后可以找很多步
				temp.add(candidates[i]);//有理无理加入去试探。
				findSum2(candidates,target,temp,ret,sum+candidates[i],i+1);//如果当前不满足，将加入下一个
				temp.remove(temp.size()-1);//很重要的一步，返回上一层的时候，需要剔除当前节点
			}
		}
		
	}
	
	
	public static void main(String[] args) {

	}

}

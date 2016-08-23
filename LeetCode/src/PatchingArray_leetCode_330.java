import java.util.ArrayList;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年4月2日 下午7:54:35 
 * 类说明 Given a sorted positive integer array nums and an integer n, add/patch elements to the array such that any number in range [1, n] inclusive can be formed by the sum of some elements in the array. Return the minimum number of patches required.

Example 1:
nums = [1, 3], n = 6
Return 1.

Combinations of nums are [1], [3], [1,3], which form possible sums of: 1, 3, 4.
Now if we add/patch 2 to nums, the combinations are: [1], [2], [3], [1,3], [2,3], [1,2,3].
Possible sums are 1, 2, 3, 4, 5, 6, which now covers the range [1, 6].
So we only need 1 patch.
 */
public class PatchingArray_leetCode_330 {
	public int minPathches(int [] nums, int n){
		ArrayList <String> comb = new ArrayList<String>();
		int ret = 0;
		StringBuffer sb = new StringBuffer("");
		for(int i =1 ;i<=nums.length;i++){
			combine(nums,i,0,comb,sb);
		}		
		return ret;
	}
	public void combine(int []nums,int len,int start,ArrayList<String> ret,StringBuffer sb){
		if(len == 0){
			String str =sb.toString();
			ret.add(str);
			return;
		}
		if(start == len)return;
		sb.append(nums[start]);
		combine(nums,len-1,start+1,ret,sb);
		sb.deleteCharAt(sb.length()-1);
		combine(nums,len,start+1,ret,sb);
	}
	
	public static void main(String []args){
		PatchingArray_leetCode_330 ls = new PatchingArray_leetCode_330();
		int []nums = {1,5,10};
		ls.minPathches(nums, 20);
	}
}

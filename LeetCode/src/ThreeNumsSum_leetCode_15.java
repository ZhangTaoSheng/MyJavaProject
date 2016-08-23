import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月4日 下午7:55:21 
 * 类说明 
 * 双指针问题
 */
public class ThreeNumsSum_leetCode_15 {
	List<List<Integer>> result = new ArrayList();
	
	 public List<List<Integer>> threeSum(int[] nums) {
		 int len = nums.length;
		 if(len <3)return result;
		 Arrays.sort(nums);//快排算法。
		 for(int i = 0 ;i <len-2;i++){//最后需要留两个数
			 if(i>0&&nums[i]==nums[i-1])continue;//顺序搜索，相同的组合要去除。
			 twoSum(nums,i+1,len-1,nums[i]);
		 }
		 return result;
	    }
	 private void twoSum(int[] a, int left, int right, int target){
		 while(left<right){
			 if(target + a[left]+a[right] == 0){
				 List<Integer> addList = new ArrayList();
				 addList.add(target);
				 addList.add(a[left]);
				 addList.add(a[right]);
				 result.add(addList);
				 while(left<right&&a[left]==a[left+1]){//重复的组合跳过
					 left++;
				 }
				 while(left<right&&a[right] == a[right-1]){
					 right -- ;					 
				 }
				 left++;
				 right--;
				 
			 }else if(target + a[left]+a[right]<0){
				 left++;
			 }else{
				 right--;
			 }
		 }
		 
	 }
	 
}

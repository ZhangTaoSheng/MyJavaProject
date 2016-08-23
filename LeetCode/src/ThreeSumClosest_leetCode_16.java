import java.util.Arrays;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月6日 上午9:44:36 
 * 类说明 
 */
public class ThreeSumClosest_leetCode_16 {
	int result = 0;
	 int ret;
	 public int threeSumClosest(int[] nums, int target) {
		 int len = nums.length;
		 if(len<3)return result ;
		 Arrays.sort(nums);
		 int min = Integer.MAX_VALUE;
		 for(int i = 0 ;i <len-2;i++){
			 int j = i+1;
			 int k = len-1;
			 while(j < k)
	            {
	                int sum = nums[i] + nums[j] + nums[k];
	                int diff = Math.abs(sum - target);
	                if(diff == 0 ) return sum;	
	                if(min>diff){//每次保存下最小差值的那个和，如果没有更小的，返回上次的sum，否则返回当前的sum
	                    min = diff;
	                    ret = sum;
	                }
	                if (sum > target)
	                    k--;
	                else
	                    j++;
	            }
			 
		 }
		 
	        return ret ;
	    }
	
	 public static void main(String []args){
		 ThreeSumClosest_leetCode_16  tl = new ThreeSumClosest_leetCode_16();
		 int a[] = {1,1,1,0};
		 int s = tl.threeSumClosest(a, -100);
		 System.out.println("结果是："+s);
	 }
	 
}

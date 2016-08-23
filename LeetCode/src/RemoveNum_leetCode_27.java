/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月6日 下午5:12:43 
 * 类说明 
 */
public class RemoveNum_leetCode_27 {
	 public int removeElement(int[] nums, int val) {
	        int result = 0;        
	        int len = nums.length;
	        for(int i = 0 ;i<len; i++){
	            if(nums[i] == val){
	                
	                continue;
	            }
	            else{
	                nums[result] = nums[i];
	                result++;
	            }
	        }
	        return result;
	    }

}

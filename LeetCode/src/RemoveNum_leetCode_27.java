/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��6�� ����5:12:43 
 * ��˵�� 
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

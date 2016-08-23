/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月6日 下午5:11:35 
 * 类说明 
 */
public class RemoveDuplicates_leetCode_26 {
	public int removeDuplicates(int[] nums) {
        int result = 0;
        int len = nums.length;
        for(int i = 0 ;i<len;i++){
            if(i>0&&nums[i]==nums[i-1]){
                continue;
                
            }else{
                nums[result] = nums[i];
                result++;                
            }
        }
        return result;
    }
}

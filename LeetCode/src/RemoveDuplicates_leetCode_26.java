/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��6�� ����5:11:35 
 * ��˵�� 
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��4�� ����7:55:21 
 * ��˵�� 
 * ˫ָ������
 */
public class ThreeNumsSum_leetCode_15 {
	List<List<Integer>> result = new ArrayList();
	
	 public List<List<Integer>> threeSum(int[] nums) {
		 int len = nums.length;
		 if(len <3)return result;
		 Arrays.sort(nums);//�����㷨��
		 for(int i = 0 ;i <len-2;i++){//�����Ҫ��������
			 if(i>0&&nums[i]==nums[i-1])continue;//˳����������ͬ�����Ҫȥ����
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
				 while(left<right&&a[left]==a[left+1]){//�ظ����������
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

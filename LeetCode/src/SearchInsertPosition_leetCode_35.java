/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��18�� ����6:05:40 
 * ��˵�� 
 */
public class SearchInsertPosition_leetCode_35 {
	public int ret = 0;
	public boolean isFind = false;
	public int insert_index = 0;
	 public int searchInsert(int[] nums, int target) {
		 if(nums.length == 0)return -1;
		 int ret_insert = binSearch(nums,0,nums.length-1,target);
		 if(isFind)return ret;
		 else return ret_insert;
		         
	    }
	 public int binSearch(int[]nums,int left,int right,int target){
		 int mid = left+(right-left)/2;
		 insert_index = mid;//ÿ���м��index,���û���ҵ�����¼���һ�ε�index 
		 if(left<= right){//���ֲ��ұ���Ҫ���ڡ�
			 if(nums[mid]<target){
				 binSearch(nums,mid+1,right,target);
			 }
			 if(nums[mid]>target){
				 binSearch(nums,left,mid-1,target);				
			 }
			 if(nums[mid] == target){
				 ret = mid;
				 isFind = true;
				 return ret;
			 }
		 }
		 return insert_index;
	 }
	 public static void main(String agrs[]){
		 SearchInsertPosition_leetCode_35 ls = new SearchInsertPosition_leetCode_35();
		 int [] nums = {1,2,3,56,65,66,76,77,87};
		int ret = ls.searchInsert(nums, 4);
		System.out.println("����ǣ�"+ret);
		 
	 }
}

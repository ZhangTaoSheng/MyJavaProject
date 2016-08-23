/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��20�� ����7:37:00 
 * ��˵�� ,�ҵ������е�K����������ÿ����㷨����ʵ��
 */
public class FindKth {
	public  int findKth(int[]nums,int k){
		if(k<=0&& nums.length<k)return 0;
		int mid= 0;
		int start = 0;
		int end = nums.length-1;
		mid = getMid(nums,start,end);
		while(mid!= k){
			
			if(mid<k){//�����׼ֵС��K����˵��Ŀ��ֵ�ں���
				start =mid+1;
				mid = getMid(nums,start,end);
			}
			if(mid>k){//�����׼ֵ����K����˵��Ŀ��ֵ��ǰ���
				end = mid-1;
				mid =getMid(nums,start,end);
			}
		}
		
		return nums[mid];		
	}

	
	//���ŵ��㷨��Ҫ�����
	public int getMid(int []nums,int start,int end){
		int temp = nums[start];
		while(start<end){
			while(nums[end]>=temp&&start<end){//��Ҫ���ǵ��ڷ���
				end--;
			}
			nums[start] = nums[end];
			while(nums[start]<=temp&&start<end){
				start++;		
			}
			nums[end] = nums[start];
		}
		nums[start] = temp;
		return start;
	}
	
	public static void main(String args[]){
		FindKth fk = new FindKth();
		int []nums = {5,2,8,4,3,7};
		System.out.println(fk.findKth(nums, 2));
	}
}

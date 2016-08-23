/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月20日 下午7:37:00 
 * 类说明 ,找到数组中第K大的数，利用快排算法可以实现
 */
public class FindKth {
	public  int findKth(int[]nums,int k){
		if(k<=0&& nums.length<k)return 0;
		int mid= 0;
		int start = 0;
		int end = nums.length-1;
		mid = getMid(nums,start,end);
		while(mid!= k){
			
			if(mid<k){//如果基准值小于K，则说明目标值在后半段
				start =mid+1;
				mid = getMid(nums,start,end);
			}
			if(mid>k){//如果基准值大于K，则说明目标值在前半段
				end = mid-1;
				mid =getMid(nums,start,end);
			}
		}
		
		return nums[mid];		
	}

	
	//快排的算法需要记清楚
	public int getMid(int []nums,int start,int end){
		int temp = nums[start];
		while(start<end){
			while(nums[end]>=temp&&start<end){//不要忘记等于符号
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

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月18日 下午3:25:04 
 * 类说明 
 */
public class SearchRange_leetCode_34 {
	public int [] ret_real= {0,0};
	public int [] ret_false = {-1,-1};
	public List <Integer> ret_link = new ArrayList<Integer>();		
	public int [] searchRange(int [] nums,int target){

		binSearch(nums, 0,nums.length-1,target);
		if(ret_link.toArray().length == 0)return ret_false;
		int [] ret = new int[ret_link.toArray().length];

		for(int i = 0; i<ret_link.toArray().length ;i++){
			ret[i]=(int)ret_link.toArray()[i];
		}
		Arrays.sort(ret);
		ret_real[0]= ret[0];
		ret_real[1]= ret[ret.length-1];
		return ret_real;
	}
	public void binSearch(int[]nums,int left,int right,int target){
		int mid = left+(right-left)/2;
		if(left<=right){
			if(nums[mid]>target){
				binSearch(nums,left,mid-1,target);		
			}
			if(nums[mid]<target){
				binSearch(nums,mid+1,right,target);
			}
			if(nums[mid]==target){
				ret_link.add(mid);	
				binSearch(nums,left,mid-1,target);	
				binSearch(nums,mid+1,right,target);
			}
		}

	}
	public static void main(String []args){
		int a [] = {1,1,1,1,1};
		SearchRange_leetCode_34 ls = new SearchRange_leetCode_34();
		int [] ret = ls.searchRange(a,1);
		for(int i =0 ;i<ret.length;i++){
			System.out.println("结果是："+ret[i]);
		}

		//	System.out.println("结果是："+ret[1]);
		//	System.out.println("结果是："+ret[2]);

	}
}

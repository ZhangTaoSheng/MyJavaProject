import java.util.Scanner;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年4月13日 下午5:54:16 
 * 类说明 
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
	Formally the function should:
	Return true if there exists i, j, k 
	such that arr[i] < arr[j] < arr[k] given 0 ≤ i < j < k ≤ n-1 else return false.
 */
public class IncreasingTripletSubsequence_leetCode_334 {
	/*
	 * 不能凡事都靠递归解决
	 */
	public int num = 0;
	public boolean Solution(int []nums){
		if(nums.length<3)return false;
		boolean ret = false;
		for(int i = 0;i<nums.length-2;i++){
			DFS(nums,i,nums[i],0);
		}
		
		if(num ==3)return true;
		
		return ret;
	}
	public void DFS(int []nums,int start,int last,int length){
		if(length == 3){
			num = 3;
			return;
		}
		if(start == nums.length-1){
			return;
		}
		for(int i = start+1;i<nums.length;i++){
			if (nums[i]>last){
				DFS(nums,i,nums[i],length+1);
			}
				
		}
	}
	/*
	 * 类似于动态规划问题：把问题分解成两个部分：1，不满足条件的元素集合A，2，待比较元素a,与集合A中的元素匹配
	 * 找出A中最小，和次小的元素，与待比较元素a，进行问题解。
	 * 
	 * 维护一个最小值，和倒数第二小值，遍历原数组的时候，
	 * 如果当前数字小于等于最小值，更新最小值，如果小于等于倒数第二小值，更新倒数第二小值，
	 * 如果当前数字比最小值和倒数第二小值都大，说明此时有三个递增的子序列了，直接返回ture，
	 * 否则遍历结束返回false
	 */
	public boolean Solution_nonRe(int[]nums){
		int min = Integer.MAX_VALUE;
		int min_next = Integer.MAX_VALUE;
		for(int i =0;i<nums.length;i++){
			if(nums[i]<= min){
				min = nums[i];
			}
			else if(nums[i]<=min_next){
				min_next = nums[i];
			}
			else{
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int count = in.nextInt();
		int []nums = new int[count];
		for(int i =0;i<count;i++){
			nums[i] = in.nextInt();
		}
		IncreasingTripletSubsequence_leetCode_334 ls = new IncreasingTripletSubsequence_leetCode_334();
		System.out.println(ls.Solution(nums));
	}

}

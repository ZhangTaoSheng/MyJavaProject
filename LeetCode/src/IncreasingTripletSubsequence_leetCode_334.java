import java.util.Scanner;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��4��13�� ����5:54:16 
 * ��˵�� 
 * Given an unsorted array return whether an increasing subsequence of length 3 exists or not in the array.
	Formally the function should:
	Return true if there exists i, j, k 
	such that arr[i] < arr[j] < arr[k] given 0 �� i < j < k �� n-1 else return false.
 */
public class IncreasingTripletSubsequence_leetCode_334 {
	/*
	 * ���ܷ��¶����ݹ���
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
	 * �����ڶ�̬�滮���⣺������ֽ���������֣�1��������������Ԫ�ؼ���A��2�����Ƚ�Ԫ��a,�뼯��A�е�Ԫ��ƥ��
	 * �ҳ�A����С���ʹ�С��Ԫ�أ�����Ƚ�Ԫ��a����������⡣
	 * 
	 * ά��һ����Сֵ���͵����ڶ�Сֵ������ԭ�����ʱ��
	 * �����ǰ����С�ڵ�����Сֵ��������Сֵ�����С�ڵ��ڵ����ڶ�Сֵ�����µ����ڶ�Сֵ��
	 * �����ǰ���ֱ���Сֵ�͵����ڶ�Сֵ����˵����ʱ�������������������ˣ�ֱ�ӷ���ture��
	 * ���������������false
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

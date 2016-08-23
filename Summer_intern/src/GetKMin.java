/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月6日 下午8:54:55 
 * 类说明 
 */
public class GetKMin {
	public int ret=Integer.MIN_VALUE;
	public int getKmin(int []a,int k){
		if(a.length == 0)return Integer.MIN_VALUE;
		if(k>a.length)return Integer.MIN_VALUE;
		quickSort(a,0,a.length-1,k);
		return ret;
	}
	public void quickSort(int a[],int start,int end,int target){
		if(start<end){
			int Mid = getMid(a,start,end);//快排获取当前值在整个数组中的位置
			System.out.println("当前序号："+(Mid+1));
			print(a);
			if(Mid+1<target){
				quickSort( a,Mid,end,target-Mid);
			}else if(Mid+1>target){
				quickSort(a,start,Mid,target); 
			}else{
				ret = a[Mid];
			}
			
		}		
	}
	public int getMid(int a[],int left,int right){
		int temp = a[left];
		while(left<right){
			while(left<right&&temp<=a[right]){//千万不能忘了等于
				right--;				
			}
			a[left] = a[right];//比目标值小的，放在上次左指针指向的位置
			while(left<right&&temp>=a[left]){
				left++;
			}
			a[right] = a[left];//比目标值大的，放在上次右指针指向的位置
		}
		a[left] = temp;//最后将目标值放在合适的位置
		return left;
	}
	
	public void print(int []a ){
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		System.out.println();
	}
	
	public static void main(String []args){
		GetKMin gk = new GetKMin();
		int[] nums = {5,2,3,6,4,7,9};
		System.out.println("结果是："+gk.getKmin(nums, 5));
		
	}
}

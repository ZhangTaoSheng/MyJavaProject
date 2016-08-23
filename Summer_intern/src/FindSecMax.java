/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月7日 上午9:54:59 
 * 类说明，找出数组中第二大的数。
 * 方法：用空间换时间，每次比较两次 
 */
public class FindSecMax {
	public static int findSecMax(int []a ){
		int max = a[0];
		int secMax = Integer.MIN_VALUE;
		for(int i =1; i<a.length;i++){
			if(a[i]>max){
				secMax = max;//在变化最大值之前，将最大值赋给次大值
				max = a[i];
			}else{
				if(secMax<a[i])
					secMax = a[i];//如果最大值没有改变，那么与次大值进行比较，若比次大值大，则将此值赋给次大值变量
			}
		}
		return secMax;
	}
	public static void main(String args[]){
		int []a = {1,3,5,7,8,9};
		System.out.println(FindSecMax.findSecMax(a));
	}

}

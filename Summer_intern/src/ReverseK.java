/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月6日 下午7:32:48 
 * 类说明 
 */
public class ReverseK {
	public void reverse(int a[],int left,int right){
		for(;left<right;left++,right--){
			int temp = a[left];
			a[left]= a[right];
			a[right] = temp;
		}
	}
	public void shift_k(int a[],int k){
		if(a.length<k)return;
		k = k%a.length;
		reverse(a,a.length-k,a.length-1);
		reverse(a,0,a.length-k-1);
		reverse(a,0,a.length-1);
	}
	
	public static void main(String arg[]){
		ReverseK  ls = new ReverseK();
		int [] a = {1,2,3,5,4};
		ls.shift_k(a, 3);
		for(int i =0 ;i<a.length;i++){
		System.out.print(a[i]+" ");
		}
	}
}

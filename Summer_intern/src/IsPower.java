/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月7日 上午9:15:16 
 * 判断一个数是否为2^n，
 *方法一：利用移位运算，如果满足条件，这个数的二进制只有一个1
 *方法二：利用相邻的两个数做与运算，如果一个数M为2^n，则表示为0001000这种形式，则M-1表示为，0000111的形式，做与运算以后为0 
 */
public class IsPower {
	public static boolean isPower_shift(int n){
		if(n<1)return false;
		int m =1;
		while(m<=n){
			if(m==n)return true;
			m<<=1;
		}
		return false;
	}
	public static boolean isPower_and(int n){
		if(n<1)return false;
		if(n ==1)return true;
		return (n&(n-1))==0;
	}
	public static void main(String []args){
		System.out.println(isPower_and(0));
		System.out.println(isPower_shift(4));
	}
	
	
}

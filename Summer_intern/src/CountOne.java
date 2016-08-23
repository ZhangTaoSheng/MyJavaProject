/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月7日 上午9:37:48 
 * 类说明 :求一个数的二进制表示中1的个数
 * 方法一：利用移位运算逐个判断是否为一
 * 方法二：利用相邻两个数的与运算，每与一次，消去一个1
 */
public class CountOne {

	public static int count_shift(int a){
		int count = 0;
		while(a>0){
			if((a&1) ==1)//每次与1进行与运算
				count++;
			a>>=1;
		}
		return count;
	}
	public static int count_and(int a){
		int count = 0;
		while(a>0){
			a =a&(a-1);//每次与一次，就会消去一个1，所以直到这个数为0，持续加1.
			count++;
		}
		return count;
	}
	public static void main(String args[]){
		System.out.println(CountOne.count_and(1));
		System.out.println(CountOne.count_shift(1));
	}
}

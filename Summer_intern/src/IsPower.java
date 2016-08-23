/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��7�� ����9:15:16 
 * �ж�һ�����Ƿ�Ϊ2^n��
 *����һ��������λ���㣬�������������������Ķ�����ֻ��һ��1
 *���������������ڵ��������������㣬���һ����MΪ2^n�����ʾΪ0001000������ʽ����M-1��ʾΪ��0000111����ʽ�����������Ժ�Ϊ0 
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

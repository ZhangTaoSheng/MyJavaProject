/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��7�� ����9:37:48 
 * ��˵�� :��һ�����Ķ����Ʊ�ʾ��1�ĸ���
 * ����һ��������λ��������ж��Ƿ�Ϊһ
 * �����������������������������㣬ÿ��һ�Σ���ȥһ��1
 */
public class CountOne {

	public static int count_shift(int a){
		int count = 0;
		while(a>0){
			if((a&1) ==1)//ÿ����1����������
				count++;
			a>>=1;
		}
		return count;
	}
	public static int count_and(int a){
		int count = 0;
		while(a>0){
			a =a&(a-1);//ÿ����һ�Σ��ͻ���ȥһ��1������ֱ�������Ϊ0��������1.
			count++;
		}
		return count;
	}
	public static void main(String args[]){
		System.out.println(CountOne.count_and(1));
		System.out.println(CountOne.count_shift(1));
	}
}

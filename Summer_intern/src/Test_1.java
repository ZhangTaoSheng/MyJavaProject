import java.util.HashMap;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��23�� ����2:10:43 
 * ��˵�� 
 */
public class Test_1 {
	public static int num = 0;
	public static int f(int n){
		num++;
		if(n<=3)return 1;
		else return f(n-2)+f(n-6)+1;
	}

	public static void main(String[] args) {
		Test_1 t = new Test_1();
		f(f(9));
		System.out.println(num);
	}
	
}

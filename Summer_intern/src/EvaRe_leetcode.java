/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��3��17�� ����11:25:26 
 * ��˵�� 
 * ��һ���ַ����������ѧ��������أ�
 * Integer.valueOf();//�ַ�ת����
 * String.valueOf();//����ת�ַ�
 * str.contains(str);//����ַ������Ƿ���ĳ���ַ�
 */
import java.util.*;
public class EvaRe_leetcode {
	public int test (String[] tokens){
		int ret = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();//��ջ�ṹ�ǳ�����
		for (String t:tokens){
			if(!operators.contains(t)){
				stack.push(t);
			}else{
				int a = Integer.valueOf(stack.pop());//���ַ���ת������
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(t);
				switch(index){
				case 0 :
					stack.push(String.valueOf(a+b));//������ת���ַ���
					break;
				case 1 :
					stack.push(String.valueOf(a-b));//������ת���ַ���
					break;
				case 2 :
					stack.push(String.valueOf(a*b));//������ת���ַ���
					break;
				case 3 :
					stack.push(String.valueOf(a/b));//������ת���ַ���
					break;
				}
			}
		}
		ret = Integer.valueOf(stack.pop());
		return ret;
	}
	
}

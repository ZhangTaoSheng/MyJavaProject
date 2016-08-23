import java.util.Stack;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��6�� ����9:50:57 
 * ��˵�� 
 * ����ջ������
 */
public class ValidParentheses_leetCode_21 {
	Stack ss = new Stack();
	public boolean isValid(String s) {
		
		if(s.length()%2 != 0)return false;//����ż�������ȣ�����false;
		if(s.charAt(0) == ']'||s.charAt(0) == ')' ||s.charAt(0) == '}' )return false;//��һ���ַ�������ʼ���ţ��ͷ���false
		for (int i = 0 ;i<s.length();i++){
			if(s.charAt(i) == '['||s.charAt(i) == '(' ||s.charAt(i) == '{'){//������ʼ���ţ���ջ
				ss.push(s.charAt(i));
			}else{
				char item = (char)ss.pop();//���������ͳ�ջ
				if(s.charAt(i) == ']'){//��һƥ�䣬һ��û��ƥ���ϣ�����false
					if(item != '[')return false;
				}else if(s.charAt(i) == '}'){
					if(item != '{')return false;
				}else{
					if(item != '(')return false;
				}
			}
		}
		if(ss.isEmpty())return true;//���ƥ��Ļ���ջ�϶�Ϊ��
		else return false;//�����Ϊ�գ�һ����false;
		
		
	}
	public static void main(String [] args){
		ValidParentheses_leetCode_21  ll = new ValidParentheses_leetCode_21();
		System.out.println("�����"+ll.isValid("({)}[]"));
		
	}
	
}
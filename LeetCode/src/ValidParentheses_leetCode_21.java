import java.util.Stack;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月6日 下午9:50:57 
 * 类说明 
 * 考查栈的运用
 */
public class ValidParentheses_leetCode_21 {
	Stack ss = new Stack();
	public boolean isValid(String s) {
		
		if(s.length()%2 != 0)return false;//不是偶数倍长度，返回false;
		if(s.charAt(0) == ']'||s.charAt(0) == ')' ||s.charAt(0) == '}' )return false;//第一个字符不是起始括号，就返回false
		for (int i = 0 ;i<s.length();i++){
			if(s.charAt(i) == '['||s.charAt(i) == '(' ||s.charAt(i) == '{'){//遇到起始符号，入栈
				ss.push(s.charAt(i));
			}else{
				char item = (char)ss.pop();//遇到回括就出栈
				if(s.charAt(i) == ']'){//逐一匹配，一旦没有匹配上，返回false
					if(item != '[')return false;
				}else if(s.charAt(i) == '}'){
					if(item != '{')return false;
				}else{
					if(item != '(')return false;
				}
			}
		}
		if(ss.isEmpty())return true;//如果匹配的话，栈肯定为空
		else return false;//如果不为空，一定是false;
		
		
	}
	public static void main(String [] args){
		ValidParentheses_leetCode_21  ll = new ValidParentheses_leetCode_21();
		System.out.println("结果是"+ll.isValid("({)}[]"));
		
	}
	
}
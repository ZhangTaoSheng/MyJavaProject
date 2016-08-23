/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月17日 上午11:25:26 
 * 类说明 
 * 讲一个字符串数组的数学表达结果返回，
 * Integer.valueOf();//字符转数字
 * String.valueOf();//数字转字符
 * str.contains(str);//检测字符串中是否含有某个字符
 */
import java.util.*;
public class EvaRe_leetcode {
	public int test (String[] tokens){
		int ret = 0;
		String operators = "+-*/";
		Stack<String> stack = new Stack<String>();//用栈结构非常方便
		for (String t:tokens){
			if(!operators.contains(t)){
				stack.push(t);
			}else{
				int a = Integer.valueOf(stack.pop());//将字符串转成数字
				int b = Integer.valueOf(stack.pop());
				int index = operators.indexOf(t);
				switch(index){
				case 0 :
					stack.push(String.valueOf(a+b));//将数字转成字符串
					break;
				case 1 :
					stack.push(String.valueOf(a-b));//将数字转成字符串
					break;
				case 2 :
					stack.push(String.valueOf(a*b));//将数字转成字符串
					break;
				case 3 :
					stack.push(String.valueOf(a/b));//将数字转成字符串
					break;
				}
			}
		}
		ret = Integer.valueOf(stack.pop());
		return ret;
	}
	
}

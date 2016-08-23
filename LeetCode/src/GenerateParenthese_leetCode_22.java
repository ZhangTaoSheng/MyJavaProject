import java.util.ArrayList;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年2月25日 下午4:08:35 
 * 类说明 左括号的个数大于等于右括号的个数。所以，我们就可以按照这个规则去打印括号：
 * 假设在位置k我们还剩余left个左括号和right个右括号，如果left>0，则我们可以直接打印左括号，
 * 而不违背规则。能否打印右括号，我们还必须验证left和right的值是否满足规则，如果left>=right，
 * 则我们不能打印右括号，因为打印会违背合法排列的规则，否则可以打印右括号。如果left和right均为零，
 * 则说明我们已经完成一个合法排列，可以将其打印出来。通过深搜，我们可以很快地解决问题，针对n=2，
 * 问题的解空间如下：
 */
public class GenerateParenthese_leetCode_22 {
	public String str = "";
	public List<String> generateParenthesis(int n) {
		List<String> ret = new ArrayList<String>();
		GenParen(ret,str,n,n);//左右括号数一定相同
		return ret;
	}
	public void GenParen(List<String>ret,String str, int left,int right){
		if(left>right)return;//左右括号还剩多少，规则是，左括号必须剩的少于右括号
		if(left == 0&&right == 0){
			ret.add(str);
			return;
		}
		if(left>0){
			GenParen(ret,str+"(",left-1,right);
		}
		if(right>0){
			GenParen(ret,str+")",left,right-1);
		}
	}
	public static void main(String [] args){
		GenerateParenthese_leetCode_22 ls = new GenerateParenthese_leetCode_22();
		List<String> result = ls.generateParenthesis(3);
		for(int i = 0 ;i <result.size();i++){
			System.out.println(result.get(i));
		}
		
	}
}

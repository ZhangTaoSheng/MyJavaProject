import java.util.ArrayList;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��2��25�� ����4:08:35 
 * ��˵�� �����ŵĸ������ڵ��������ŵĸ��������ԣ����ǾͿ��԰����������ȥ��ӡ���ţ�
 * ������λ��k���ǻ�ʣ��left�������ź�right�������ţ����left>0�������ǿ���ֱ�Ӵ�ӡ�����ţ�
 * ����Υ�������ܷ��ӡ�����ţ����ǻ�������֤left��right��ֵ�Ƿ�����������left>=right��
 * �����ǲ��ܴ�ӡ�����ţ���Ϊ��ӡ��Υ���Ϸ����еĹ��򣬷�����Դ�ӡ�����š����left��right��Ϊ�㣬
 * ��˵�������Ѿ����һ���Ϸ����У����Խ����ӡ������ͨ�����ѣ����ǿ��Ժܿ�ؽ�����⣬���n=2��
 * ����Ľ�ռ����£�
 */
public class GenerateParenthese_leetCode_22 {
	public String str = "";
	public List<String> generateParenthesis(int n) {
		List<String> ret = new ArrayList<String>();
		GenParen(ret,str,n,n);//����������һ����ͬ
		return ret;
	}
	public void GenParen(List<String>ret,String str, int left,int right){
		if(left>right)return;//�������Ż�ʣ���٣������ǣ������ű���ʣ������������
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

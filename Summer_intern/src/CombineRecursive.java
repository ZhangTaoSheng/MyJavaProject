/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月23日 下午1:02:27 
 * 类说明 
 * 对字符串进行组合
 * 例如“abc”，组合为a,b,c,ab,bc,ac,abc;
 * 利用递归方法，遍历字符串，每个字符分为取和不取两种情况，如果取，则加入到字符串结果中，如果没取，则删除上次那个字符，进行遍历 
 */
public class CombineRecursive {
	public static void combine (char[]c,int start,int len,StringBuffer sb){
		if(len ==0){
			System.out.println(sb+"");
			return;
		}
		if(start == c.length)
		{			
			return;
		}
		sb.append(c[start]);//如果该组合中包含这个字符，则只用考虑剩下的字符中，字符串长度为len-1的情况
		combine(c,start+1,len-1,sb);
		sb.deleteCharAt(sb.length()-1);//如果该组合中不包含这个字符，则考虑余下的字符串中，组合长度为len.
		combine(c,start+1,len,sb);
	}
	public static void main(String args[]){
		String s = "abcde";
		char c[] = s.toCharArray();
		StringBuffer sb = new StringBuffer("");
		for(int i =1;i<=c.length;i++){//字符串长度为1,2，....len的组合情况
			combine(c,0,i,sb);//字符串长度为递增 。
		}
	}
}

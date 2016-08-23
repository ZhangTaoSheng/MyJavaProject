import java.util.ArrayList;
import java.util.List;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月20日 下午2:14:54 
 * 类说明 
 */
public class PermutationAll {
	
	public void permutation(char[] str){
		if(str == null)return;
		List<Character>temp = new ArrayList<Character>();
		for(int i =0;i<str.length;i++){
			if(i>0&&str[i]==str[i-1])continue;
			for(int j = 0;j<str.length-i;j++){
				permutation(str,i,j,temp);
			}			
		}
		
	}
	public void permutation (char[]str,int start,int num,List<Character>temp){
		if(num == 0){
			for(int j=0;j<temp.size();j++){
				System.out.print(temp.get(j)+" ");
			}
			System.out.println();
			return;
		}
		else{
			for (int i =start;i<str.length;i++){
				temp.add(str[i]);
				permutation(str,i+1,num-1,temp);
		//		temp.remove(str[i]);
			}
		}
		
	}
	
	public static void main(String args[]){
		PermutationAll ls = new PermutationAll();
		char [] str = {'a','b','c','d'};
		ls.permutation(str);
	}

}

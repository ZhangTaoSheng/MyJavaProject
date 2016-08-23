/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月20日 下午1:34:27 
 * 类说明 
 */
public class PermutationC {
	public  void permutation(String str){
		if(str == null){
			return;
		}
		permutation (str.toCharArray(),str.length(),0);
	}
	public void permutation(char[] str, int length,int index){
		if(index == length){
			for(int i =0;i<str.length;i++){
				System.out.print(str[i]+" ");
			}
			System.out.println();
		}
		else{
			for(int j =index;j<length;j++){
				char temp = str[index];
				str[index] = str[j];
				str[j] = temp;
				permutation(str,length,index+1);
				 temp = str[index];
				str[index] = str[j];
				str[j] = temp;
			}
		}
		
	}
	public static void main(String args[]){
		PermutationC ls = new PermutationC();
		ls.permutation(new String ("abc"));
	}
}

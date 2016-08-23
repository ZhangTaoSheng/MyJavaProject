/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��12��31�� ����2:56:47 
 * ��˵�� 
 */
public class LongestCommonPrefix_leetCode_14 {

	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";//������������Ϊ0��Ԫ�أ��򷵻ؿ�
		String prefix = strs[0];//�Ե�һ���ַ���Ϊǰ׺
		for (int i = 1 ; i<strs.length;i++){
			if(strs[i].length() == 0)return "";//����ַ���Ϊ�գ��򷵻ؿ�
			int len = prefix.length() < strs[i].length() ? prefix.length() : strs[i].length();  //ǰ׺�ĳ�����Զѡ����С���ȵ��ַ���
			int j ;
			for (j = 0 ;j<len;j++){
			
				if(prefix.charAt(j)!=strs[i].charAt(j))break;//�������ͬ�������ǰ׺
			}

			prefix = prefix.substring(0,j);//�ض�ǰ׺��������� ������Ŀ�����
		}
		return prefix;


	}
	public String bin_compare(String[] strs,int left , int right){
		String bin_result = "";
		String left_bin_result = "";
		String right_bin_result = "";
		int mid = (right-left)/2;
		while(left<right){
			left_bin_result = bin_compare(strs,left,mid );
			right_bin_result = bin_compare(strs,mid+1,right);
			int length  = left_bin_result.length()>right_bin_result.length()?right_bin_result.length():left_bin_result.length();
			for(int i = 0 ;i<length ;i++){
				if(left_bin_result.charAt(i)!=right_bin_result.charAt(i)){
					for(int j = 0 ;j<i;j++){
						bin_result = bin_result+left_bin_result.charAt(j);
					}
					return bin_result;
					//break;
				}

			}
			for(int j = 0 ;j<length;j++){
				bin_result = bin_result+left_bin_result.charAt(j);
			}


		}
		return bin_result;
	}

	public static void main(String []agrs){
		String [] strs = {"ads","ads"};
		LongestCommonPrefix_leetCode_14 lp = new LongestCommonPrefix_leetCode_14();
		String result = lp.longestCommonPrefix(strs);
		System.out.println("����ǣ�"+result);
	}
}

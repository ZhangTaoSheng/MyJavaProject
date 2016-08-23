/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年12月31日 下午2:56:47 
 * 类说明 
 */
public class LongestCommonPrefix_leetCode_14 {

	public String longestCommonPrefix(String[] strs) {
		if(strs.length == 0) return "";//如果输入的数组为0个元素，则返回空
		String prefix = strs[0];//以第一个字符串为前缀
		for (int i = 1 ; i<strs.length;i++){
			if(strs[i].length() == 0)return "";//如果字符串为空，则返回空
			int len = prefix.length() < strs[i].length() ? prefix.length() : strs[i].length();  //前缀的长度永远选择最小长度的字符串
			int j ;
			for (j = 0 ;j<len;j++){
			
				if(prefix.charAt(j)!=strs[i].charAt(j))break;//如果不相同，则更改前缀
			}

			prefix = prefix.substring(0,j);//截断前缀，这个方法 的区间的开区间
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
		System.out.println("结果是："+result);
	}
}

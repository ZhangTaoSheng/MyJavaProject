/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月6日 下午5:53:23 
 * 类说明 
 */
public class Implement0strStr_leetCode_28 {
	public int strStr(String haystack, String needle) {
        int result = -1;
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len2 == 0)return 0;//如果待匹配字符串为空，则返回0
        if(len2!= 0&&len1 == 0)return-1;//如果元字符串为空且匹配字符串不为空，则返回-1
        if(len2>len1) return -1;
       
        for(int i = 0; i<len1-len2+1;i++){//窗的起始位置
        	boolean isfind = true;
        	for(int j = i;j<i+len2;j++){//窗内的字符串进行比较
        		if(haystack.charAt(j)!= needle.charAt(j-i)){
        			isfind = false;//如果没有匹配到，窗口右移
        		}
        	}
        	if(!isfind){
        		continue;//窗口右移
        	}
        	
        	result = i;
        	break;
      
        	
        }
        return result;
    }
	public static void main(String args [] ){
		Implement0strStr_leetCode_28 ll = new Implement0strStr_leetCode_28();
		String haystack = "a";
		System.out.println("结果是"+ll.strStr(haystack, "a"));
		
	}
}

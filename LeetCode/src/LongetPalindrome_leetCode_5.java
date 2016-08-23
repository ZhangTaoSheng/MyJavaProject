import java.util.Arrays;

/**
 * FileName:     LongetPalindrome.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年12月27日 下午1:20:48
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年12月27日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年12月27日 下午1:20:48 
 * 类说明 
 */
/**
 * @ClassName:     LongetPalindrome
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年12月27日 下午1:20:48
 *
 */

public class LongetPalindrome_leetCode_5 {
	public int longestPalind(String s){
		String result  = "";
		char [] ss =s.toCharArray();
		int windowLength = ss.length;//定义窗长
		int startIndex = 0;
		int num =ss.length/2;
		boolean isfind = true;
	
			for (int i = windowLength;i>0;i-- )
			{
				for(int j = 0;j<=ss.length-i;j++) //定义窗的起始位置
				{
					for(int m = j; m<=j+i/2;m++){//定义窗内匹配开始
						if(ss[m] !=ss[2*j+i-m-1]){//对称性匹配
							isfind = false; //不匹配就跳出当前循环
							break;
						}
					}
					if(!isfind){ 
						isfind = true;//将标志位设为初始值，移动窗
						continue;		//移动窗			
					}
					startIndex = j;//如果满足上述的回文条件，则记录开始index
					for(int n = startIndex;n<startIndex+i;n++){
						result = result +ss[n];//将消息重组
					}
					return result.length();
				}					
			}	
		return result.length();	
	}
	


	public static void main(String args[] ){
		String test = "aaaabbbbbba";
		LongetPalindrome_leetCode_5 lp = new LongetPalindrome_leetCode_5();
		int result = lp.longestPalind(test);
		System.out.println("结果是："+result);

	}

}

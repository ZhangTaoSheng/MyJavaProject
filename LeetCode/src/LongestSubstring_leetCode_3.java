/**
 * FileName:     LongestSubstring.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年10月13日 下午12:00:07
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年10月13日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年10月13日 下午12:00:07 
 * 类说明 
 */
/**
 * @ClassName:     LongestSubstring
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年10月13日 下午12:00:07
 *
 */

public class LongestSubstring_leetCode_3 {
	
	/**
	 * 
	 * @Title: lengthOfLongestSubstring
	 * @Description: TODO(找出最大不同子串的长度)
	 * @param: @param s
	 * @param: @return   
	 * @return: int   
	 * @throws
	 */
	public int lengthOfLongestSubstring(String s) {
		char []str = null;
		int strLength = 0;	
		str = s.toCharArray(); //字符串变成数组

		strLength = str.length;
		int temp_index = 0;
		char temp ;
		int result = 0;
		int pre_length = 0;
		int lengthofsub = 1;//每次拿一个元素进来，就要更新一下目标字串的长度
		int change_index = 0;
		if(s.equals(""))return 0;
		if(strLength == 1)return 1;
		int num =0;
		/*for(int kk=0;kk<strLength;kk++){
			if(str[kk]==str[0])num++;
			
		}
		if(num==strLength)return 1;*/
		for(int i = 1; i<strLength;i++){			
			temp_index=i;//记录拿的元素的序号，然后与前面的所有元素进行比较
			temp = str[i];
			for(int j =change_index;j<temp_index;j++){
				if(str[j]!=temp&&j==temp_index-1){//如果与前面所有的元素不相同的话，则目标字串的长度加1
					lengthofsub =temp_index-change_index+1;
					pre_length = pre_length>lengthofsub?pre_length:lengthofsub;//每次的长度和前一次的比较，如果变长了，就更新。
				}
				if(str[j]==temp){//如果与前面某一个元素相同的话，则记录相同元素的序号，更新目标字串的长度,下次进入的元素与这个重复的元素比较。
					change_index = j+1;//如果有一个元素
					lengthofsub = 1;
					num++;//记录跳转个数
					break;					
				}
				
			}
			
			
		}
		if(num==strLength-1)return 1;		
        return pre_length;
    }
	
	
	

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */

	public static void main(String[] args) {
		LongestSubstring_leetCode_3 ss = new LongestSubstring_leetCode_3();
	int result = 	ss.lengthOfLongestSubstring("asdf");
	System.out.println("结果是："+result);

	}

}

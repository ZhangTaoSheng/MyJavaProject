/**
 * FileName:     Sequential_search.java
 * @Description: TODO(选择排序)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年6月13日 上午10:16:29
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年6月13日       zts         1.0             1.0
 * 
 */
 
package com.java.search;

import java.util.Arrays;
import java.util.Random;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年6月13日 上午10:16:29 
 * 类说明 
 */
/**
 * @ClassName:     Sequential_search
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年6月13日 上午10:16:29
 *
 */

public class Sequential_search {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */

	public static int seqSearch(int []arr,int first ,int last,int target){
		for(int i = first ; i<last; i++){
			if(arr[i]==target)
				return i;			//对不匹配的值不做任何反应，只返还最终结果
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Random rd  = new Random ();
		
		int ss[] = new int [100] ;//对于int [] 数组是基本类型，没有实现comparable接口，所以必须用普通类型来实现。（查看API文档。）
		for(int i = 0 ;i<100;i++){
			 ss[i] = rd.nextInt(100);
		}
		System.out.println(Arrays.toString(ss));

	    int index = 0;
		while((index = seqSearch(ss,index, ss.length ,12))!=-1){//将搜索对象的所有索引值找出
			System.out.print(index +"");
			index ++;//每次搜索改变子数组的头索引
		}
//		int a;
//		System.out.println((a=3));这两条语句是为了弄清楚赋值语句到底返回的是什么值，返回的还是3，所以当赋值语句用在while， if 等选择判断语句中时，
		//注意返回的仍然是赋值后的值。

	}
}

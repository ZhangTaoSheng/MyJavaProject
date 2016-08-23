package com.java.search;
/**
 * FileName:     binSearch_generic.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年4月8日 下午9:06:33
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年4月8日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年4月8日 下午9:06:33 
 * 类说明 
 */
/**
 * @ClassName:     binSearch_generic
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年4月8日 下午9:06:33
 *
 */
import java.util.*;


public class binSearch_generic {

	/**
	 * @Title: main
	 * @Description: TODO(这里用一句话描述这个方法的作用)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */
public static <T extends Comparable<? super T>>
int binSearch(T [] arr, int first ,int last, T target){
	int mid ;
	T midValue;		
	while(first<last){
		mid = (first + last)/2;
		midValue = arr[mid];
		if(midValue.compareTo(target)==0)return mid;
		else if(midValue.compareTo(target)<0)
			first = mid+1;
		else if(midValue.compareTo(target)>0)last = mid;
	}
	return -1;
	
}
	public static void main(String[] args) {
		Integer []ss = new Integer[100];
		for(int i = 0 ;i<100; i++){
			ss[i]= new Random().nextInt(100);
		}
		System.out.println(Arrays.toString(ss));
		
		System.out.print(binSearch(ss,0 ,100,45));
	}

}

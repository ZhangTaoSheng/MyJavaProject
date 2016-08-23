package com.java.search;
/**
 * FileName:     binSearch.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年4月7日 下午9:08:37
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年4月7日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年4月7日 下午9:08:37 
 * 类说明 
 */
/**
 * @ClassName:     binSearch
 * @Description:TODO(二分查找，列表已经经过了排序)
 * @author:    zts
 * @date:        2015年4月7日 下午9:08:37
 *
 */
import java.util.*;
public class binSearch {

	/**
	 * @Title: main
	 * @Description: TODO(二分搜索通过选择列表中心点开始搜索，每次都会得出3种结果，如果小于中心点，则向左搜索，否则向右搜索或直接搜索到对象返回。
	 * 每次向各自方向搜索的时候，重新定义数组的左右区间。其最坏搜索Internet（log2（n+1））次)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */
	public static int binSearch(int arr[],int first ,int last , int target){
		int mid ;
		int midValue;
		while(first<last){//二分查找的终止条件是，当first >= last 的时候,说明已经搜索完毕了。
			mid = (first+last)/2;
			midValue = arr[mid];
			if(midValue==target) return mid;
			else if(midValue>target){
				last = mid;
			}
			else
				first = mid +1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Random rd = new Random();
		int [] arr = new int [100];
		for (int i =0 ; i<arr.length; i++){
			arr [i] = rd.nextInt(100); 
		}
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		 int result = binSearch(arr, 0, arr.length-1,30);
		System.out.println("搜索的结果是："+result);
	}

}

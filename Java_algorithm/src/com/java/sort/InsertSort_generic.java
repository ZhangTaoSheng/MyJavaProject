/**
 * FileName:     InsertSort_generic.java
 * @Description: TODO(选择排序)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年6月15日 下午1:48:48
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年6月15日       zts         1.0             1.0
 * 
 */
 
package com.java.sort;

import java.util.Random;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年6月15日 下午1:48:48 
 * 类说明 
 */
/**
 * @ClassName:     InsertSort_generic
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年6月15日 下午1:48:48
 *
 */

public class InsertSort_generic {
	
	public static <T extends Comparable<? super T>> void insertionSort(T [] arr){
		int i, j, n = arr.length;
		T target;
		for(i =1;i< n ; i++){
			j = i ;
			target = arr[i];
			while (j>0 && target.compareTo(arr[j-1])<0){//与前面排序好的元素比较，并且是逆向比较。
				arr[j] = arr[j-1];
				j--;
			}
			arr[j]= target;//插入值
			System.out.println("\n"+"第"+i+"次排序：");
			for(int m = 0 ;m<arr.length; m++){
				System.out.print("  "+arr[m] );
			}
		}
		
	}
	
	public static void main (String args[]){
		Random rnd = new Random();
		Integer[] arr = new Integer[15];
		for(int i = 0 ;i<arr.length; i++){
			arr[i] = rnd.nextInt(100);
			System.out.print("  " +arr[i]);
		}
		
		
		insertionSort(arr);
		
		System.out.println("\n"+"排序后的：");
		for(int i = 0 ;i<arr.length; i++){
			System.out.print("  "+arr[i] );
		}
	}

}

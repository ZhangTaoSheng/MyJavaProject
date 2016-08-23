/**
 * FileName:     SelectSort.java
 * @Description: TODO(选择排序)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年6月13日 上午10:06:35
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年6月13日       zts         1.0             1.0
 * 
 */
 
package com.java.sort;

import java.util.Arrays;
import java.util.Random;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年6月13日 上午10:06:35 
 * 类说明 
 */
/**
 * @ClassName:     SelectSort
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年6月13日 上午10:06:35
 *
 */

public class SelectSort {
	
	public static void main (String args [] ){
		Random rd = new Random();
		int ss[] = new int [100] ;//对于int [] 数组是基本类型，没有实现comparable接口，所以必须用普通类型来实现。（查看API文档。）
		for(int i = 0 ;i<100;i++){
			 ss[i] = rd.nextInt(100);
		}
		System.out.println(Arrays.toString(ss));

		selectionSort(ss);
		System.out.println(Arrays.toString(ss));
		
	}
	public static void selectionSort(int [] a ){
		        if (a == null || a.length <= 0) {  
		            return;  
		        }  
		        for (int i = 0; i < a.length; i++) {  
		            int min = i; /* 将当前下标定义为最小值下标 */  
		  
		            for (int j = i + 1; j < a.length; j++) {  
		                if (a[min] > a[j]) { /* 如果有小于当前最小值的关键字 */  
		                    min = j; /* 将此关键字的下标赋值给min */  
		                }  
		            }  		           
		                int tmp = a[min];  
		                a[min] = a[i];  
		                a[i] = tmp;  		            
		        }  
		    }  
		
	}
	


package com.java.sort;
/**
 * FileName:     selectionSort_generic.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年4月8日 下午8:11:18
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年4月8日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年4月8日 下午8:11:18 
 * 类说明 
 */
/**
 * @ClassName:     selectionSort_generic
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年4月8日 下午8:11:18
 *
 */
import java.util.*;

public class SelectionSort_generic {

	/**
	 * @Title: main
	 * @Description: TODO(泛型搜索，对于任何实现了接口Comparable的T的未指定类型的超类，都可以实现排序)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */

	public static <T extends Comparable<? super T>>//在继承层次结构中支持comparable接口，这句话的意思是，"?"和绑定super T的使用
	                                               //会指示编译器验证类型T或者是T的某些超类是否实现了comparable接口。
	void selectionSort(T[] ss){                    //? super T 的意思是T的未指定类型的超类。这里T是下界。
		int smallIndex;
		int pass, j ,n = ss.length;
		T temp;
		for(pass = 0 ; pass < n ; pass++){
			smallIndex = pass;
			for(j=pass+1 ; j < n ; j++){
				if(ss[j].compareTo(ss[smallIndex])<0) smallIndex = j;
			}
			temp = ss[pass]; ss[pass]=ss[smallIndex]; ss[smallIndex]= temp;
		}
	}
	
	public static void main(String[] args) {
		Random rd = new Random();
		Integer []ss = new Integer[100];//对于int [] 数组是基本类型，没有实现comparable接口，所以必须用普通类型来实现。（查看API文档。）
		for(int i = 0 ;i<100;i++){
			 ss[i] = rd.nextInt(100);
		}
		System.out.println(Arrays.toString(ss));

		selectionSort(ss);
		System.out.println(Arrays.toString(ss));

	}

}

/**
 * FileName:     InsertSort_generic.java
 * @Description: TODO(ѡ������)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��6��15�� ����1:48:48
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��6��15��       zts         1.0             1.0
 * 
 */
 
package com.java.sort;

import java.util.Random;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��6��15�� ����1:48:48 
 * ��˵�� 
 */
/**
 * @ClassName:     InsertSort_generic
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��6��15�� ����1:48:48
 *
 */

public class InsertSort_generic {
	
	public static <T extends Comparable<? super T>> void insertionSort(T [] arr){
		int i, j, n = arr.length;
		T target;
		for(i =1;i< n ; i++){
			j = i ;
			target = arr[i];
			while (j>0 && target.compareTo(arr[j-1])<0){//��ǰ������õ�Ԫ�رȽϣ�����������Ƚϡ�
				arr[j] = arr[j-1];
				j--;
			}
			arr[j]= target;//����ֵ
			System.out.println("\n"+"��"+i+"������");
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
		
		System.out.println("\n"+"�����ģ�");
		for(int i = 0 ;i<arr.length; i++){
			System.out.print("  "+arr[i] );
		}
	}

}

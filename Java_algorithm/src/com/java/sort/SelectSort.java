/**
 * FileName:     SelectSort.java
 * @Description: TODO(ѡ������)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��6��13�� ����10:06:35
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��6��13��       zts         1.0             1.0
 * 
 */
 
package com.java.sort;

import java.util.Arrays;
import java.util.Random;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��6��13�� ����10:06:35 
 * ��˵�� 
 */
/**
 * @ClassName:     SelectSort
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��6��13�� ����10:06:35
 *
 */

public class SelectSort {
	
	public static void main (String args [] ){
		Random rd = new Random();
		int ss[] = new int [100] ;//����int [] �����ǻ������ͣ�û��ʵ��comparable�ӿڣ����Ա�������ͨ������ʵ�֡����鿴API�ĵ�����
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
		            int min = i; /* ����ǰ�±궨��Ϊ��Сֵ�±� */  
		  
		            for (int j = i + 1; j < a.length; j++) {  
		                if (a[min] > a[j]) { /* �����С�ڵ�ǰ��Сֵ�Ĺؼ��� */  
		                    min = j; /* ���˹ؼ��ֵ��±긳ֵ��min */  
		                }  
		            }  		           
		                int tmp = a[min];  
		                a[min] = a[i];  
		                a[i] = tmp;  		            
		        }  
		    }  
		
	}
	


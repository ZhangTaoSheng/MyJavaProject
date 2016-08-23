package com.java.sort;
/**
 * FileName:     selectionSort_generic.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��4��8�� ����8:11:18
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��4��8��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��4��8�� ����8:11:18 
 * ��˵�� 
 */
/**
 * @ClassName:     selectionSort_generic
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��4��8�� ����8:11:18
 *
 */
import java.util.*;

public class SelectionSort_generic {

	/**
	 * @Title: main
	 * @Description: TODO(���������������κ�ʵ���˽ӿ�Comparable��T��δָ�����͵ĳ��࣬������ʵ������)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */

	public static <T extends Comparable<? super T>>//�ڼ̳в�νṹ��֧��comparable�ӿڣ���仰����˼�ǣ�"?"�Ͱ�super T��ʹ��
	                                               //��ָʾ��������֤����T������T��ĳЩ�����Ƿ�ʵ����comparable�ӿڡ�
	void selectionSort(T[] ss){                    //? super T ����˼��T��δָ�����͵ĳ��ࡣ����T���½硣
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
		Integer []ss = new Integer[100];//����int [] �����ǻ������ͣ�û��ʵ��comparable�ӿڣ����Ա�������ͨ������ʵ�֡����鿴API�ĵ�����
		for(int i = 0 ;i<100;i++){
			 ss[i] = rd.nextInt(100);
		}
		System.out.println(Arrays.toString(ss));

		selectionSort(ss);
		System.out.println(Arrays.toString(ss));

	}

}

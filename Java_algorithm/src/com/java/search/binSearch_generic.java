package com.java.search;
/**
 * FileName:     binSearch_generic.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��4��8�� ����9:06:33
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��4��8��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��4��8�� ����9:06:33 
 * ��˵�� 
 */
/**
 * @ClassName:     binSearch_generic
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��4��8�� ����9:06:33
 *
 */
import java.util.*;


public class binSearch_generic {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
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

/**
 * FileName:     Sequential_search.java
 * @Description: TODO(ѡ������)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��6��13�� ����10:16:29
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��6��13��       zts         1.0             1.0
 * 
 */
 
package com.java.search;

import java.util.Arrays;
import java.util.Random;

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��6��13�� ����10:16:29 
 * ��˵�� 
 */
/**
 * @ClassName:     Sequential_search
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��6��13�� ����10:16:29
 *
 */

public class Sequential_search {

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */

	public static int seqSearch(int []arr,int first ,int last,int target){
		for(int i = first ; i<last; i++){
			if(arr[i]==target)
				return i;			//�Բ�ƥ���ֵ�����κη�Ӧ��ֻ�������ս��
		}
		return -1;
	}

	public static void main(String[] args) {
		
		Random rd  = new Random ();
		
		int ss[] = new int [100] ;//����int [] �����ǻ������ͣ�û��ʵ��comparable�ӿڣ����Ա�������ͨ������ʵ�֡����鿴API�ĵ�����
		for(int i = 0 ;i<100;i++){
			 ss[i] = rd.nextInt(100);
		}
		System.out.println(Arrays.toString(ss));

	    int index = 0;
		while((index = seqSearch(ss,index, ss.length ,12))!=-1){//�������������������ֵ�ҳ�
			System.out.print(index +"");
			index ++;//ÿ�������ı��������ͷ����
		}
//		int a;
//		System.out.println((a=3));�����������Ϊ��Ū�����ֵ��䵽�׷��ص���ʲôֵ�����صĻ���3�����Ե���ֵ�������while�� if ��ѡ���ж������ʱ��
		//ע�ⷵ�ص���Ȼ�Ǹ�ֵ���ֵ��

	}
}

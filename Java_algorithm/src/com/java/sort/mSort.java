/**
 * FileName:     mSort.java
 * @Description: TODO(ѡ������)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��6��15�� ����3:52:59
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
 * @version ����ʱ�䣺2015��6��15�� ����3:52:59 
 * ��˵�� 
 */
/**
 * @ClassName:     mSort
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��6��15�� ����3:52:59
 *
 */
public class mSort{  	  
    public static void main(String[] args) {  
    	Random rnd = new Random();
		int[] arr = new int[20];
			
		for(int i = 0 ;i<arr.length; i++){
			arr[i] = rnd.nextInt(100);
			System.out.print(arr[i]+"\t");
		}
		System.out.println();
		mergeSort(arr);
    }  
  
    public static void mergeSort(int[] data) {  
        sort(data, 0, data.length - 1);  
    }  
  
    public static void sort(int[] data, int left, int right) {  
        if (left >= right)  
            return;  
        // �ҳ��м�����  
        int center = (left + right) / 2;  
        // �����������еݹ�  
        sort(data, left, center);  
        // ���ұ�������еݹ�  
        sort(data, center + 1, right);  
        // �ϲ�  
        merge(data, left, center, right);  
        print(data);  
    }  
  
    /** 
     * ������������й鲢���鲢ǰ��2�����������򣬹鲢����Ȼ���� 
     *  
     * @param data 
     *            ������� 
     * @param left 
     *            ������ĵ�һ��Ԫ�ص����� 
     * @param center 
     *            ����������һ��Ԫ�ص�������center+1���������һ��Ԫ�ص����� 
     * @param right 
     *            ���������һ��Ԫ�ص����� 
     */  
    public static void merge(int[] data, int left, int center, int right) {  
        // ��ʱ����  
        int[] tmpArr = new int[data.length];  
        // �������һ��Ԫ������  
        int mid = center + 1;  
        // third ��¼��ʱ���������  
        int third = left;  
        // �����������һ��Ԫ�ص�����  
        int tmp = left;  
        while (left <= center && mid <= right) {  
            // ������������ȡ����С�ķ�����ʱ����  
            if (data[left] <= data[mid]) {  
                tmpArr[third++] = data[left++];  
            } else {  
                tmpArr[third++] = data[mid++];  
            }  
        }  
        // ʣ�ಿ�����η�����ʱ���飨ʵ��������whileֻ��ִ������һ����  
        while (mid <= right) {  
            tmpArr[third++] = data[mid++];  
        }  
        while (left <= center) {  
            tmpArr[third++] = data[left++];  
        }  
        // ����ʱ�����е����ݿ�����ԭ������  
        // ��ԭleft-right��Χ�����ݱ����ƻ�ԭ���飩  
        while (tmp <= right) {  
            data[tmp] = tmpArr[tmp++];  
        }  
    }  
  
    public static void print(int[] data) {  
        for (int i = 0; i < data.length; i++) {  
            System.out.print(data[i] + "\t");  
        }  
        System.out.println();  
    }  
  
}  
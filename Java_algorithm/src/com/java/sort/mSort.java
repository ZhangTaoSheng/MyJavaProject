/**
 * FileName:     mSort.java
 * @Description: TODO(选择排序)
* All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年6月15日 下午3:52:59
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
 * @version 创建时间：2015年6月15日 下午3:52:59 
 * 类说明 
 */
/**
 * @ClassName:     mSort
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年6月15日 下午3:52:59
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
        // 找出中间索引  
        int center = (left + right) / 2;  
        // 对左边数组进行递归  
        sort(data, left, center);  
        // 对右边数组进行递归  
        sort(data, center + 1, right);  
        // 合并  
        merge(data, left, center, right);  
        print(data);  
    }  
  
    /** 
     * 将两个数组进行归并，归并前面2个数组已有序，归并后依然有序 
     *  
     * @param data 
     *            数组对象 
     * @param left 
     *            左数组的第一个元素的索引 
     * @param center 
     *            左数组的最后一个元素的索引，center+1是右数组第一个元素的索引 
     * @param right 
     *            右数组最后一个元素的索引 
     */  
    public static void merge(int[] data, int left, int center, int right) {  
        // 临时数组  
        int[] tmpArr = new int[data.length];  
        // 右数组第一个元素索引  
        int mid = center + 1;  
        // third 记录临时数组的索引  
        int third = left;  
        // 缓存左数组第一个元素的索引  
        int tmp = left;  
        while (left <= center && mid <= right) {  
            // 从两个数组中取出最小的放入临时数组  
            if (data[left] <= data[mid]) {  
                tmpArr[third++] = data[left++];  
            } else {  
                tmpArr[third++] = data[mid++];  
            }  
        }  
        // 剩余部分依次放入临时数组（实际上两个while只会执行其中一个）  
        while (mid <= right) {  
            tmpArr[third++] = data[mid++];  
        }  
        while (left <= center) {  
            tmpArr[third++] = data[left++];  
        }  
        // 将临时数组中的内容拷贝回原数组中  
        // （原left-right范围的内容被复制回原数组）  
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

package com.java.sort;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月4日 下午8:54:26 
 * 类说明  二分法插入排序和直接插入排序一样，在前n个已经排好序的基础上，将第n+1个找到合适的插入位置。
 */
public class bin_InsertSort {
	private static void sort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];//取出当前待比较的元素。
            int left = 0;
            int right = i-1;
            int mid = 0;
            while(left<=right){
                mid = (left+right)/2;
                if(temp<a[mid]){
                    right = mid-1;
                }else{
                    left = mid+1;
                }
            }
            for (int j = i-1; j >= left; j--) {
                a[j+1] = a[j];//将所有比当前待比较元素向后移动
            }
            if(left != i){
                a[left] = temp;//插入当前值
            }
        }
    }
	 public static void main(String[] args) {
	        int[] a={49,38,65,97,176,213,227,49,78,34,12,164,11,18,1};
	        System.out.println("排序之前：");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]+" ");
	        }
	        //二分插入排序
	        sort(a);
	        System.out.println();
	        System.out.println("排序之后：");
	        for (int i = 0; i < a.length; i++) {
	            System.out.print(a[i]+" ");
	        }
	    }
}

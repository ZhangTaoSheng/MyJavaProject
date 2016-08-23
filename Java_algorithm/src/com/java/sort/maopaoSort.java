package com.java.sort;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月4日 下午9:09:09 
 * 类说明 
 */
public class maopaoSort {
	public void mergeSort_descend(int[] a){
	//冒泡排序
	for (int i = 0; i < a.length; i++) {//一个个数比较
		for(int j = 0; j<a.length-i-1; j++){
			//这里-i主要是每遍历一次都把最大的i个数沉到最底下去了，没有必要再替换了
			if(a[j]>a[j+1]){//每次比较相邻的两个数字
				int temp = a[j];
				a[j] = a[j+1];
				a[j+1] = temp;
			}
			
		}
		for (int s = 0; s < a.length; s++) {
			System.out.print(a[s]+" ");
		}
		System.out.println('\n'+"第 "+(i+1)+" 次排序");
	}
	System.out.println();
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
		}
	}
	public void mergeSort_raise(int[] a){
		//冒泡排序
		for (int i = 0; i < a.length; i++) {//一个个数比较
			for(int j = a.length-1; j>i; --j){
				//每一次把最小的数放在最前面
				if(a[j]<a[j-1]){//每次比较相邻的两个数字
					int temp = a[j];

					a[j] = a[j+1];
					a[j+1] = temp;
				}
			}
			for (int s = 0; s < a.length; s++) {
				System.out.print(a[s]+" ");
			}
			System.out.println('\n'+"第 "+(i+1)+" 次排序");
		}
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
			}
		}
public static void main(String[] args) {
	int[] a={49,38,65,97,76,13,27,49,78,34,12,64,1,8};
	System.out.println("排序之前：");
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
	System.out.println(""+'\n');
	maopaoSort ms = new maopaoSort();
	//ms.mergeSort_descend(a);
	ms.mergeSort_raise(a);
	
	}
}
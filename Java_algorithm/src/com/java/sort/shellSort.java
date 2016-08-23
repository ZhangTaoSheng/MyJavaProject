package com.java.sort;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月5日 下午1:18:18 
 * 类说明  希尔排序
 * 1、选择步长，步长递减，最后一个步长需为1
 * 2、按步长的个数k, 对待排序列进行k次排序
 * 3、每次排序时，采用插入排序。
 */
public class shellSort {

	public void shell(int [] a ){
		int d = a.length;
		while(true){
			d = d / 2; //步长定义
			for(int x=0;x<d;x++){//当前步长的第x组序列进行插入排序
				for(int i=x+d;i<a.length;i=i+d){
					int temp = a[i];
					int j;
					for(j=i-d;j>=0&&a[j]>temp;j=j-d){
							a[j+d] = a[j];		
					}
					a[j+d] = temp;//插入排序，是插在当前找到的值的后面一个
				}
			}
			if(d == 1){
				break;
			}
		}

	}


	public static void main (String [] args){
		shellSort ss = new shellSort ();
		int [] a = {2,3,53,543,22,1,44,6};
		ss.shell(a);
		for (int i = 0; i < a.length; i++) {  
			System.out.print(a[i] + "\t");  
		}  
	}
}

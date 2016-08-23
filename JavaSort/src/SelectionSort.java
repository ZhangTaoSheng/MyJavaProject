import java.util.Arrays;

/**
 * FileName:     SelectionSort.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��4��7�� ����7:46:13
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��4��7��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��4��7�� ����7:46:13 
 * ��˵�� 
 */
/**
 * @ClassName:     SelectionSort
 * @Description:TODO(ѡ�������Ǵӵ�һ��Ԫ�ؿ�ʼ���ҳ���СԪ�أ�Ȼ�󽫵�һ��Ԫ�������СԪ�ؽ���������������С��Ԫ����ڶ���Ԫ�ؽ��������������α�����ȥ)
 * @author:    zts
 * @date:        2015��4��7�� ����7:46:13
 *
 */

public class SelectionSort {

	/**
	 * @Title: main
	 * @Description: TODO(ѡ��������ÿ�α����ҳ���С��Ԫ�أ��������ͷԪ�ؽ������������ȶ��Ծͱ��ƻ��ˡ�
	 * �Ƚ��ֿڣ��ٸ����ӣ�����5 8 5 2 9�� ����֪����һ��ѡ���1��Ԫ��5���2��������ôԭ������2��5�����ǰ��˳��ͱ��ƻ��ˣ�
	 * ����ѡ��������һ���ȶ��������㷨��ѡ�������ʱ�临�Ӷ���O(n2),һ����Ҫ����n(n-1)/2�Ρ���n��С��ʱ��ȽϺ��ʡ�)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */
	public static void selectionSort(int [] arr){
		int temp;
		int smallIndex;
		int pass,j ;
		int n = arr.length ;
		for(pass = 0; pass<n; pass++){
			smallIndex = pass;
			for(j=pass+1; j<n ; j++){
				if(arr[j]<arr[smallIndex])smallIndex = j;
				
			}
			temp = arr[pass];arr[pass]= arr[smallIndex];arr[smallIndex]=temp;
		}
		
		
	}

	public static void main(String[] args) {
		int arr[]= {12,14,57,35,34,85,38,89,35,48};
		selectionSort(arr);
		String ss = Arrays.toString(arr);
		System.out.print(ss);

	}

}

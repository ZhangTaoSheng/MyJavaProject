import java.util.Arrays;

/**
 * FileName:     SelectionSort.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年4月7日 下午7:46:13
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年4月7日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年4月7日 下午7:46:13 
 * 类说明 
 */
/**
 * @ClassName:     SelectionSort
 * @Description:TODO(选择排序是从第一个元素开始，找出最小元素，然后将第一个元素与该最小元素交换；随后继续将次小的元素与第二个元素交换…………依次遍历下去)
 * @author:    zts
 * @date:        2015年4月7日 下午7:46:13
 *
 */

public class SelectionSort {

	/**
	 * @Title: main
	 * @Description: TODO(选择排序，是每次遍历找出最小的元素，与遍历的头元素交换。交换后稳定性就被破坏了。
	 * 比较拗口，举个例子，序列5 8 5 2 9， 我们知道第一遍选择第1个元素5会和2交换，那么原序列中2个5的相对前后顺序就被破坏了，
	 * 所以选择排序不是一个稳定的排序算法。选择排序的时间复杂度是O(n2),一共需要搜索n(n-1)/2次。当n较小的时候比较合适。)
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

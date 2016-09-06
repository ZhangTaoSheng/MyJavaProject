/**
 * FileName:     seqSearch.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年4月7日 下午8:13:25
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年4月7日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年4月7日 下午8:13:25 
 * 类说明 
 */
/**
 * @ClassName:     seqSearch
 * @Description:TODO(顺序查找，从头搜索到尾部，没搜索到则返回-1.最差是n次，最好是1次，平均一次成功的搜索需要(n+1)/2次)
 * @author:    zts
 * @date:        2015年4月7日 下午8:13:25
 *
 */


public class seqSearch {

	/**
	 * @Title: main
	 * @Description: TODO(返回第一个匹配到对象的索引值，注意last是不包括的)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */
	
	public static int seqSearch(int []arr,int first ,int last,int target){
		for(int i = first ; i<last; i++){
			if(arr[i]==target)
				return i;			//对不匹配的值不做任何反应，只返还最终结果
		}
		return -1;
	}

	public static void main(String[] args) {
		int []arr = {1,123,12,12,13,12,12,3};
		int ss = seqSearch(arr,1,5,12);
		System.out.println(ss);
	    int index = 0;
		while((index = seqSearch(arr,index, arr.length ,12))!=-1){//将搜索对象的所有索引值找出
			System.out.print(index +"");
			index ++;//每次搜索改变子数组的头索引
		}
//		int a;
//		System.out.println((a=3));这两条语句是为了弄清楚赋值语句到底返回的是什么值，返回的还是3，所以当赋值语句用在while， if 等选择判断语句中时，
		//注意返回的仍然是赋值后的值。

	}

}


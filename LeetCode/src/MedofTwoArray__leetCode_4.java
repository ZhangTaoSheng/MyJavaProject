/**
 * FileName:     MedofTwoArray.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年10月15日 下午12:23:05
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年10月15日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年10月15日 下午12:23:05 
 * 类说明 
 */
/**
 * @ClassName:     MedofTwoArray
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年10月15日 下午12:23:05
 *
 */

public class MedofTwoArray__leetCode_4 {

	/**
	 * 
	 * @Title: findMedianSortedArrays
	 * @Description: TODO(时间复杂度是log(m+n),使用二分法)
	 * @param: @param nums1
	 * @param: @param nums2
	 * @param: @return   
	 * @return: double   
	 * @throws
	 */
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {
		double result = 0;
		int low1 =0;
		int low2 = 0;
		int h1 = nums1.length-1;
		int h2 = nums2.length-1;
		int comp1 = (h1-low1)/2;
		int comp2 = (h2-low2)/2;
		if(h2>h1) return findMedianSortedArrays(nums2,nums1);
		
			while(low1<h1&&low2<h2){
				if(nums1[comp1]>nums2[comp2]){ //大的向左移动，小的向右移动
					h1 = comp1;
					if((low1+h1)%2==1){
						comp1 = (low1+h1)/2+1;
					}
					else 
						comp1 = (low1+h1)/2 ;
					low2 = comp2;
					comp2= low2+(h1-comp1);
				}
				else if(nums1[comp1]<nums2[comp2]){ //大的向左移动，小的向右移动

					low1 = comp1;
					if((low1+h1)%2==1){
						comp1 = (low1+h1)/2+1;
					}
					else 
						comp1 = (low1+h1)/2 ;
					h2 = comp2;
					comp2 = h2-(h1-comp1);
				}
				else {
					return  nums2[comp2];
				}
			}
			return nums2[comp2]; 		
	}

	public static void main(String [] args){
		int [] s1 = {1,1,1,1,1};
		int [] s2 = {2,3,7,8,8,9};

		MedofTwoArray__leetCode_4 ma = new MedofTwoArray__leetCode_4 ();
		double res = ma.findMedianSortedArrays(s1, s2);
		System.out.println("结果是："+ res);
	}

}

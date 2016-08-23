/**
 * FileName:     medofTwoArr_2.java
 * @Description: TODO(选择排序)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    名字
 * @version    V1.0 
 * Createdate:         2015年12月27日 下午5:14:43
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015年12月27日       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2015年12月27日 下午5:14:43 
 * 类说明 
 */
/**
 * @ClassName:     medofTwoArr_2
 * @Description:TODO(描述类的作用)
 * @author:    zts
 * @date:        2015年12月27日 下午5:14:43
 *
 */
import static java.lang.Math.*;
public class medofTwoArr_2_leetCode_4 {
	public double findMedianSortedArrays(int[] A, int[] B) {
		int n = A.length;
		int m = B.length;
		// the following call is to make sure len(A) <= len(B).
		// yes, it calls itself, but at most once, shouldn't be
		// consider a recursive solution
		if (n > m)
			return findMedianSortedArrays(B, A);

		// now, do binary search
		int k = (n + m - 1) / 2;
		int l = 0, r = Math.min(k, n); // r is n, NOT n-1, this is important!!
		while (l < r) {
			int midA = (l + r) / 2;
			int midB = k - midA;
			if (A[midA] < B[midB])
				l = midA + 1;
			else
				r = midA;
		}

		// after binary search, we almost get the median because it must be between
		// these 4 numbers: A[l-1], A[l], B[k-l], and B[k-l+1] 

		// if (n+m) is odd, the median is the larger one between A[l-1] and B[k-l].
		// and there are some corner cases we need to take care of.
		int a = Math.max(l > 0 ? A[l - 1] : Integer.MIN_VALUE, k - l >= 0 ? B[k - l] : Integer.MIN_VALUE);
		if (((n + m) & 1) == 1)
			return (double) a;

		// if (n+m) is even, the median can be calculated by 
		//      median = (max(A[l-1], B[k-l]) + min(A[l], B[k-l+1]) / 2.0
		// also, there are some corner cases to take care of.
		int b = Math.min(l < n ? A[l] : Integer.MAX_VALUE, k - l + 1 < m ? B[k - l + 1] : Integer.MAX_VALUE);
		return (a + b) / 2.0;
	}
	
	public static void main(String args[]){
		
		int [] s1 = {1,1,1,1,1};
		int [] s2 = {2,3,7,8,8,9};

		medofTwoArr_2_leetCode_4 ma = new medofTwoArr_2_leetCode_4 ();
		double res = ma.findMedianSortedArrays(s1, s2);
		System.out.println("结果是："+ res);
	}
}


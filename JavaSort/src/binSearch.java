/**
 * FileName:     binSearch.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��4��7�� ����9:08:37
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��4��7��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��4��7�� ����9:08:37 
 * ��˵�� 
 */
/**
 * @ClassName:     binSearch
 * @Description:TODO(���ֲ��ң��б��Ѿ�����������)
 * @author:    zts
 * @date:        2015��4��7�� ����9:08:37
 *
 */
import java.util.*;
public class binSearch {

	/**
	 * @Title: main
	 * @Description: TODO(��������ͨ��ѡ���б����ĵ㿪ʼ������ÿ�ζ���ó�3�ֽ�������С�����ĵ㣬��������������������������ֱ�����������󷵻ء�
	 * ÿ������Է���������ʱ�����¶���������������䡣�������Internet��log2��n+1������)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */
	public static int binSearch(int arr[],int first ,int last , int target){
		int mid ;
		int midValue;
		while(first<last){//���ֲ��ҵ���ֹ�����ǣ���first >= last ��ʱ��,˵���Ѿ���������ˡ�
			mid = first+last/2;
			midValue = arr[mid];
			if(midValue==target) return mid;
			else if(midValue<target){
				first = mid+1;
			}
			else
				last = mid;
		}
		return -1;
	}

	public static void main(String[] args) {
		int []arr = {12,15,45,35,54,48,38,83,31,348,354,4542,654};
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println(binSearch(arr, 0, 10, 15));
	}

}
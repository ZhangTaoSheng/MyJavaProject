/**
 * FileName:     seqSearch.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��4��7�� ����8:13:25
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��4��7��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��4��7�� ����8:13:25 
 * ��˵�� 
 */
/**
 * @ClassName:     seqSearch
 * @Description:TODO(˳����ң���ͷ������β����û�������򷵻�-1.�����n�Σ������1�Σ�ƽ��һ�γɹ���������Ҫ(n+1)/2��)
 * @author:    zts
 * @date:        2015��4��7�� ����8:13:25
 *
 */


public class seqSearch {

	/**
	 * @Title: main
	 * @Description: TODO(���ص�һ��ƥ�䵽���������ֵ��ע��last�ǲ�������)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */
	
	public static int seqSearch(int []arr,int first ,int last,int target){
		for(int i = first ; i<last; i++){
			if(arr[i]==target)
				return i;			//�Բ�ƥ���ֵ�����κη�Ӧ��ֻ�������ս��
		}
		return -1;
	}

	public static void main(String[] args) {
		int []arr = {1,123,12,12,13,12,12,3};
		int ss = seqSearch(arr,1,5,12);
		System.out.println(ss);
	    int index = 0;
		while((index = seqSearch(arr,index, arr.length ,12))!=-1){//�������������������ֵ�ҳ�
			System.out.print(index +"");
			index ++;//ÿ�������ı��������ͷ����
		}
//		int a;
//		System.out.println((a=3));�����������Ϊ��Ū�����ֵ��䵽�׷��ص���ʲôֵ�����صĻ���3�����Ե���ֵ�������while�� if ��ѡ���ж������ʱ��
		//ע�ⷵ�ص���Ȼ�Ǹ�ֵ���ֵ��

	}

}


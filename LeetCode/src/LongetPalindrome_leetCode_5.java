import java.util.Arrays;

/**
 * FileName:     LongetPalindrome.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��12��27�� ����1:20:48
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��12��27��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��12��27�� ����1:20:48 
 * ��˵�� 
 */
/**
 * @ClassName:     LongetPalindrome
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��12��27�� ����1:20:48
 *
 */

public class LongetPalindrome_leetCode_5 {
	public int longestPalind(String s){
		String result  = "";
		char [] ss =s.toCharArray();
		int windowLength = ss.length;//���崰��
		int startIndex = 0;
		int num =ss.length/2;
		boolean isfind = true;
	
			for (int i = windowLength;i>0;i-- )
			{
				for(int j = 0;j<=ss.length-i;j++) //���崰����ʼλ��
				{
					for(int m = j; m<=j+i/2;m++){//���崰��ƥ�俪ʼ
						if(ss[m] !=ss[2*j+i-m-1]){//�Գ���ƥ��
							isfind = false; //��ƥ���������ǰѭ��
							break;
						}
					}
					if(!isfind){ 
						isfind = true;//����־λ��Ϊ��ʼֵ���ƶ���
						continue;		//�ƶ���			
					}
					startIndex = j;//������������Ļ������������¼��ʼindex
					for(int n = startIndex;n<startIndex+i;n++){
						result = result +ss[n];//����Ϣ����
					}
					return result.length();
				}					
			}	
		return result.length();	
	}
	


	public static void main(String args[] ){
		String test = "aaaabbbbbba";
		LongetPalindrome_leetCode_5 lp = new LongetPalindrome_leetCode_5();
		int result = lp.longestPalind(test);
		System.out.println("����ǣ�"+result);

	}

}

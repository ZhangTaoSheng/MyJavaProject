/**
 * FileName:     LongestSubstring.java
 * @Description: TODO(ѡ������)
 * All rights Reserved, Designed By ZTE-ITS
 * Copyright:    Copyright(C) 2010-2011
 * Company       SJTU.
 * @author:    ����
 * @version    V1.0 
 * Createdate:         2015��10��13�� ����12:00:07
 *
 * Modification  History:
 * Date         Author        Version        Discription
 * -----------------------------------------------------------------------------------
 * 2015��10��13��       zts         1.0             1.0
 * 
 */

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2015��10��13�� ����12:00:07 
 * ��˵�� 
 */
/**
 * @ClassName:     LongestSubstring
 * @Description:TODO(�����������)
 * @author:    zts
 * @date:        2015��10��13�� ����12:00:07
 *
 */

public class LongestSubstring_leetCode_3 {
	
	/**
	 * 
	 * @Title: lengthOfLongestSubstring
	 * @Description: TODO(�ҳ����ͬ�Ӵ��ĳ���)
	 * @param: @param s
	 * @param: @return   
	 * @return: int   
	 * @throws
	 */
	public int lengthOfLongestSubstring(String s) {
		char []str = null;
		int strLength = 0;	
		str = s.toCharArray(); //�ַ����������

		strLength = str.length;
		int temp_index = 0;
		char temp ;
		int result = 0;
		int pre_length = 0;
		int lengthofsub = 1;//ÿ����һ��Ԫ�ؽ�������Ҫ����һ��Ŀ���ִ��ĳ���
		int change_index = 0;
		if(s.equals(""))return 0;
		if(strLength == 1)return 1;
		int num =0;
		/*for(int kk=0;kk<strLength;kk++){
			if(str[kk]==str[0])num++;
			
		}
		if(num==strLength)return 1;*/
		for(int i = 1; i<strLength;i++){			
			temp_index=i;//��¼�õ�Ԫ�ص���ţ�Ȼ����ǰ�������Ԫ�ؽ��бȽ�
			temp = str[i];
			for(int j =change_index;j<temp_index;j++){
				if(str[j]!=temp&&j==temp_index-1){//�����ǰ�����е�Ԫ�ز���ͬ�Ļ�����Ŀ���ִ��ĳ��ȼ�1
					lengthofsub =temp_index-change_index+1;
					pre_length = pre_length>lengthofsub?pre_length:lengthofsub;//ÿ�εĳ��Ⱥ�ǰһ�εıȽϣ�����䳤�ˣ��͸��¡�
				}
				if(str[j]==temp){//�����ǰ��ĳһ��Ԫ����ͬ�Ļ������¼��ͬԪ�ص���ţ�����Ŀ���ִ��ĳ���,�´ν����Ԫ��������ظ���Ԫ�رȽϡ�
					change_index = j+1;//�����һ��Ԫ��
					lengthofsub = 1;
					num++;//��¼��ת����
					break;					
				}
				
			}
			
			
		}
		if(num==strLength-1)return 1;		
        return pre_length;
    }
	
	
	

	/**
	 * @Title: main
	 * @Description: TODO(������һ�仰�����������������)
	 * @param: @param args   
	 * @return: void   
	 * @throws
	 */

	public static void main(String[] args) {
		LongestSubstring_leetCode_3 ss = new LongestSubstring_leetCode_3();
	int result = 	ss.lengthOfLongestSubstring("asdf");
	System.out.println("����ǣ�"+result);

	}

}

/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��6�� ����5:53:23 
 * ��˵�� 
 */
public class Implement0strStr_leetCode_28 {
	public int strStr(String haystack, String needle) {
        int result = -1;
        int len1 = haystack.length();
        int len2 = needle.length();
        if(len2 == 0)return 0;//�����ƥ���ַ���Ϊ�գ��򷵻�0
        if(len2!= 0&&len1 == 0)return-1;//���Ԫ�ַ���Ϊ����ƥ���ַ�����Ϊ�գ��򷵻�-1
        if(len2>len1) return -1;
       
        for(int i = 0; i<len1-len2+1;i++){//������ʼλ��
        	boolean isfind = true;
        	for(int j = i;j<i+len2;j++){//���ڵ��ַ������бȽ�
        		if(haystack.charAt(j)!= needle.charAt(j-i)){
        			isfind = false;//���û��ƥ�䵽����������
        		}
        	}
        	if(!isfind){
        		continue;//��������
        	}
        	
        	result = i;
        	break;
      
        	
        }
        return result;
    }
	public static void main(String args [] ){
		Implement0strStr_leetCode_28 ll = new Implement0strStr_leetCode_28();
		String haystack = "a";
		System.out.println("�����"+ll.strStr(haystack, "a"));
		
	}
}

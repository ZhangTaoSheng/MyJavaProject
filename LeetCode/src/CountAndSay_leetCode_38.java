/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version ����ʱ�䣺2016��1��18�� ����6:52:13 
 * ��˵�� 
 */
public class CountAndSay_leetCode_38 {
	
	String countAndSayForOneString(String input) {  
        char tmp = input.charAt(0);  
        int  num = 1;  
        StringBuffer newString = new StringBuffer("");  //�����಻��Ҫÿ�θı�һ�¾����ڴ��п���һ��ռ䡣
        for(int k=1;k<input.length();k++) {  
            if(input.charAt(k)==tmp) {  
                num++;  
                continue;  //���������ͬ�����֣������м�����ͬ�ģ�Ȼ������´�ѭ����
            }  
            newString.append(Integer.toString(num) + tmp);  
            tmp = input.charAt(k);  //tempֵʼ��Ϊǰһ���ַ���
            num = 1;  //������ͬ�����֣�����������1.
        }  
        newString.append(Integer.toString(num) + tmp);  //����ת������
        return newString.toString();  
    }  
      
    public String countAndSay(int n) {  
        String result = "1";  
        int i = 1;  //�ݹ��׼
        while(i<n) {  //ʹ�õݹ飬һ��Ҫ�г����ĳ���
            result = countAndSayForOneString(result);  
            System.out.println(result);
            i++;  
        }  
        return result;  
    }  
    
	public static void main(String args[]){
		CountAndSay_leetCode_38 ls = new CountAndSay_leetCode_38();
		String ret = ls.countAndSay(25);
		System.out.println(ret);
	}

}

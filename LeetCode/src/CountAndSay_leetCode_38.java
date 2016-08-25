/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年1月18日 下午6:52:13 
 * 类说明 
 */
public class CountAndSay_leetCode_38 {
	
	String countAndSayForOneString(String input) {  
        char tmp = input.charAt(0);  
        int  num = 1;  
        StringBuffer newString = new StringBuffer("");  //这种类不需要每次改变一下就在内存中开辟一块空间。
        for(int k=1;k<input.length();k++) {  
            if(input.charAt(k)==tmp) {  
                num++;  
                continue;  //如果遇到相同的数字，则几下有几个相同的，然后进入下次循环。
            }  
            newString.append(Integer.toString(num) + tmp);  
            tmp = input.charAt(k);  //temp值始终为前一个字符。
            num = 1;  //遇到不同的数字，将计数器归1.
        }  
        newString.append(Integer.toString(num) + tmp);  //根据转换规则。
        return newString.toString();  
    }  
      
    public String countAndSay(int n) {  
        String result = "1";  
        int i = 1;  //递归基准
        while(i<n) {  //使用递归，一定要有出来的出口
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

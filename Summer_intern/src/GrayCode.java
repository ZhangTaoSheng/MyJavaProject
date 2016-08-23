import java.util.*;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月28日 上午10:27:45 
 * 类说明 
 * >>是带符号右移，负数高位补1，正数补0
 *<<左移不管负数还是正数，在低位永远补0
 *>>>是不带符号右移，不论负数还是正数，高位补0
 */
public class GrayCode {
	
	public static String[] createGrayCode(int n){  
	    String[] codes = new String[2 << (n - 1)]; 
	    System.out.println("结果是："+(2<<(n-1)));
	    createGrayCode(codes, n);  
	    return codes;  
	}  
	  
	private static void createGrayCode(String[] codes, int n){  
	    if(n == 1){  
	        codes[0] = "0";  
	        codes[1] = "1";  
	    }else{  
	        createGrayCode(codes, n - 1);  //对于格雷码，可以看做是对前面的码添加0 或者1；
	        int len = 2 << (n - 1);  //格雷码的长度
	        int half = len >> 1;  //前面的一半添加0，后面的一半添加1
	        for(int i = len - 1,j = 0; i >= 0; i--){  
	            if(i < half){  
	                codes[i] = "0" + codes[--j];  
	            }else{  
	                codes[i] = "1" + codes[j++];  
	            }  
	        }  
	    }  
	}  
	
	public String[] GrayCode(int n){
		String[] graycode = new String[(int)Math.pow(2, n)];
		if(n==1){
			graycode[0]="0";
			graycode[1]="1";
			return graycode;
		}else{
			String[] last = GrayCode(n-1);
			for(int i=0;i<last.length;i++){
				graycode[i] = "0"+last[i];
				graycode[graycode.length-1-i]="1"+last[i];
				
			}
			return graycode;
		}
	}

	public static void main(String[] args) {  
	    String[] codes = createGrayCode(4);  
	    System.out.println(Arrays.toString(codes));  
	} 
}

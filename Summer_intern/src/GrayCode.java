import java.util.*;
/** 
 * @author zts  E-mail: 15527174455@163.com
 * @version 创建时间：2016年3月28日 上午10:27:45 
 * 类说明 
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
	        createGrayCode(codes, n - 1);  
	        int len = 2 << (n - 1);  
	        int half = len >> 1;  
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
